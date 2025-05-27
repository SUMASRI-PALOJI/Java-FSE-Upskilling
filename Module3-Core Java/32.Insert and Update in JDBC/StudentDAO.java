import java.sql.*;

public class StudentDAO {
    private Connection conn;

    public StudentDAO() throws SQLException {
        conn = DriverManager.getConnection("jdbc:sqlite:students.db");
    }

    public void insertStudent(int id, String name) throws SQLException {
        String sql = "INSERT INTO students(id, name) VALUES(?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.executeUpdate();
        }
    }

    public void updateStudent(int id, String name) throws SQLException {
        String sql = "UPDATE students SET name = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        }
    }

    public static void main(String[] args) throws SQLException {
        StudentDAO dao = new StudentDAO();
        dao.insertStudent(1, "Alice");
        dao.updateStudent(1, "Alicia");
    }
}
