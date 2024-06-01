/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package state;

/**
 *
 * @author ASUS
 */
 import java.sql.*;
public class State {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/emp","root","");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/emp","root","");
//            System.out.println("Connection established");
System.out.println("Connection established");
Statement smt = con.createStatement();
ResultSet rs = smt.executeQuery("select *from emp");
//            Statement stmt = con.createStatement();
//           ResultSet rs = stmt.executeQuery("select*from emp");
while(rs.next())
{
    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
    System.out.println("data fetched");
}
con.close();
        }catch(Exception e)
        {
        }

        
    }
    
}
