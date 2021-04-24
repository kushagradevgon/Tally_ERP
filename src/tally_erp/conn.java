/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tally_erp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kushagra Devgon
 */
public class conn {
        Connection c;
                Statement s;
            
            conn(){
                
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(conn.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try {
                   c =DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12393939","sql12393939","ePdb8eyu4X");
                   s = c.createStatement();
                } catch (SQLException ex) {
                    Logger.getLogger(conn.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                    

            }
}
