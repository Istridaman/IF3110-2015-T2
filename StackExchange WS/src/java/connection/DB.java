/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Venny
 */
public class DB {
      public static Connection connect() {
        String host = "jdbc:mysql://localhost:3306/wbd2?zeroDateTimeBehavior=convertToNull [root on Default schema]";
        String uName = "root";
        String uPass = "12345";
        Connection con=null;
        try {
            con = DriverManager.getConnection(host, uName, uPass);
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
        return con;
    }
}