import java.sql.*;

public class BankTransaction {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:bank.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            conn.setAutoCommit(false);

            try (PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
                 PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?")) {

                debit.setInt(1, 100);
                debit.setInt(2, 1);  // From account
                debit.executeUpdate();

                credit.setInt(1, 100);
                credit.setInt(2, 2);  // To account
                credit.executeUpdate();

                conn.commit();
                System.out.println("Transfer successful.");
            } catch (SQLException e) {
                conn.rollback();
                System.out.println("Transfer failed. Rolled back.");
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
