import java.sql.*;

public class DeleteOperation 
{
    public static void main(String[] args) throws SQLException 
    {
        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String password = "1234";
        // get a connection to database
        Connection connection = DriverManager.getConnection(url, user, password);
        // create a statement
        try (Statement statement = connection.createStatement()) 
        {
            // execute SQL query
            String query = "DELETE FROM employees WHERE id = '119'";
            int rowsAffected = statement.executeUpdate(query);
            System.out.println("Deletion complete");
            System.out.println("No of rows affected:" + rowsAffected);
        }
    }
}