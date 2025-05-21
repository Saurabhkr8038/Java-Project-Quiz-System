/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
/**
 *
 * @author chinm
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/libms","root","chan1069");
            System.out.println("Driver loaded");
            return con;
            
        } catch (Exception e) {
            System.out.println("Exception is "+e);
            return null;
        }
    }
}
