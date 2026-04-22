import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgresConnect {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/testdb";
        String user = "testuser";
        String password = "123456789";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to PostgreSQL!");

            Statement stmt = conn.createStatement();

            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS student(id SERIAL PRIMARY KEY, name VARCHAR(50))");

            stmt.executeUpdate("INSERT INTO student(name) VALUES('Rojan')");
            // stmt.executeUpdate("DELETE FROM student WHERE name = 'Rojan'");
            // stmt.executeUpdate("UPDATE student SET name = 'Rojan' WHERE name = 'Bhisan'");  

            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}