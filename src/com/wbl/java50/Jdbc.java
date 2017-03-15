package com.wbl.java50;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 
public class Jdbc {
 
    public static void main(String[] args) {
         
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.
                    getConnection("jdbc:oracle:thin:@<hostname>:<port num>:<DB name>"
                        ,"user","password");
            stmt = con.createStatement();
            String query = "update table emp set salary=2000 where empid=200";
            //count will give you how many records got updated
            int count = stmt.executeUpdate(query);
            System.out.println("Updated queries: "+count);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
    }
}