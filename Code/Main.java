import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Step 1: Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

            // Step 3: Create PreparedStatement
            String query = "INSERT INTO students VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, 101);
            ps.setString(2, "Varadaraj");

            // Step 4: Execute Query
            ps.executeUpdate();
            System.out.println("Data Inserted Successfully");

            // Step 5: Close
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
