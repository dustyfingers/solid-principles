package single_responsibility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeModel {

    public void save(Employee employee)
    {

        // serialize object into a string
        // String objectStr = MyUtils.serializeToString(employee);
        String objectStr = "{ name: 123 }";
        Connection conn = null;
        Statement statement = null;

        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB", "root", "testpass");
            statement = conn.createStatement();
            statement.execute("INSERT INTO EMPLOYEES VALUES (" + objectStr + ")");
        }
        catch (Exception err)
        {
            err.printStackTrace();
        }
    }

}
