import java.sql.*;

public class ReadOperation 
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
        String query = "SELECT * FROM employees;";
        ResultSet resultSet = statement.executeQuery(query);

        // process the result set
        while (resultSet.next())
        {
            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
        }

    }
}