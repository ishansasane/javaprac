// Import required JDBC libraries
import java.sql.*;

public class DatabaseConnection {

    // Database connection details
    private static final String URL = "jdbc:mysql://localhost:3306/students";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) throws Exception {

        // Register JDBC driver
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

        // Open a connection
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

        // Create a statement object
        Statement statement = connection.createStatement();

        // Execute SQL query (replace this with your actual query)
        String query = "SELECT * data";
        ResultSet resultSet = statement.executeQuery(query);

        // Process the result set
        while (resultSet.next()) {
            // Get data from each column
            Integer column1 = resultSet.getInt("ID");
            String column2 = resultSet.getString("Name");

            // Process data as needed
            System.out.println("Column 1: " + column1);
            System.out.println("Column 2: " + column2);
        }

        // Close resources
        statement.close();
        connection.close();
    }
}
