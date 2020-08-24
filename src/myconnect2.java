
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnthonyCee
 */
public class myconnect2 {
    
     Connection con = null;
    public static Connection ConnectDb(){
        
       try{
           
           Class.forName("org.sqlite.JDBC");
           Connection conn = DriverManager.getConnection("jdbc:sqlite:javat.db");
           Statement statement = conn.createStatement();
           statement.setQueryTimeout (30);
           
           return conn;
          
           
       } catch(Exception evt){
        JOptionPane.showMessageDialog(null,evt);   
       }
        return null;
        
    }
    

    
}
