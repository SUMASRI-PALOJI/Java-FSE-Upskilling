import java.sql.*;

public class JDBCSelectExample {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db"; // Use MySQL URL if needed
        String query = "SELECT * FROM students";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
