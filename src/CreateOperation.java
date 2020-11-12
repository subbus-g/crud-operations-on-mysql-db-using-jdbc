import java.sql.*;

public class CreateOperation 
{
    public static void main(String[] args) throws SQLException 
    {
        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String password = "1234";
        // get a connection to database
        Connection connection = DriverManager.getConnection(url, user, password);
        // create a statement
        try(Statement statement = connection.createStatement())
        {
            // execute SQL query
            String query = "INSERT INTO demo.employees VALUES(119,'steve','jobs','bill.gates@outlook.com')";
            try 
            {
                statement.executeUpdate(query);
                System.out.println("Insertion Operation is successfull");
            } 
            catch (SQLException e) 
            {
                System.out.println("Insertion Operation is failed");
            }
        }
    }
}