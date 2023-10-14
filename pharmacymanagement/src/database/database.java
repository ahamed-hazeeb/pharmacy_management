/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author dilshan
 */
public class database {
    static Connection c;
    public static Connection pharmacy(){
       // Connection c=null;
        if(c==null){
            try {
            
                Class.forName("com.mysql.jdbc.Driver");
                c= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","1988913");
                
                
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        return c;
    
    }
    
}
