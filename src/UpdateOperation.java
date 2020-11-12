import java.sql.*;

public class UpdateOperation 
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
            String query = "UPDATE employees SET first_name = 'Johny' WHERE id = 1;";
            statement.executeUpdate(query);
            System.out.println("Updation complete");
        }
    }
}