/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.sql.*;
public class dbconnect {
    Connection con;
    public Connection connect()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airplane","root","");
            return con;
            
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
    
}
