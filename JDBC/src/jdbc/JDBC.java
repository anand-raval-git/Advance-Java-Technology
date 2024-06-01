/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc;

/**
 *
 * @author ASUS
 */
import java.sql.*;
public class JDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Data","root","")) {
                System.out.println("Connection established");
                
                Statement stmt=con.createStatement();
                
                ResultSet rs=stmt.executeQuery("select * fromm emp");
                while(rs.next())
                    
                    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
                System.out.println("DATA FETCHED");
            }
    }catch(ClassNotFoundException | SQLException e)
                    {
                    
                    }
    
    }
} 
