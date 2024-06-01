/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1a;

/**
 *
 * @author ASUS
 */
import java.sql.*;
public class Ex1a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ex1a", "root", "");
        String sql = "select * from emp";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        System.out.println("Records\n");
        while(rs.next()){
        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
        }catch(Exception e){
                
        }
    }
            
    }
    
