import java.sql.*;

public class employee 
{
    public static void main(String[] args) throws Exception 
    {
        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String password = "1234";

        // get a connection to database
        Connection connection = DriverManager.getConnection(url, user, password);

        // create a statement
        Statement statement = connection.createStatement();

        // execute SQL query
        String query = "INSERT INTO demo.employees VALUES(6,'mini','gates','bill.gates@outlook.com')";
        statement.executeUpdate(query);

        System.out.println("Insertion complete");
        
    }

}
