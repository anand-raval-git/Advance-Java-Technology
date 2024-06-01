/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1b;

/**
 *
 * @author ASUS
 */
import java.sql.*;
public class Ex1b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
                Class.forName("com.mysql.jdbc.Driver");
            
        //2. establish connection by con object
            
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ex1b","root","");
        System.out.println("Connection established");
 
  
   
        // Query which needs parameters
        String query= "Select * from student where StuName = ? and City = ?";
 
        // Prepare Statement
        PreparedStatement myStmt = con.prepareStatement(query);
 
        // Set Parameters
        myStmt.setString(1, "srk");
        myStmt.setString(2, "jawan");
 
        // Execute SQL query
        ResultSet rs = myStmt.executeQuery();
 
        System.out.println("Name     City");
        System.out.println("----     ----");
        
 
        // Display function to show the Resultset
        while (rs.next()) {
            String Name = rs.getString("StuName");
            String City = rs.getString("City");
            System.out.println(Name + "     " + City);
        }
        
        
        System.out.println("Insert Record");
        PreparedStatement myStmt1=con.prepareStatement("insert into student values(?,?,?)");           
        myStmt1.setString(1,"1  ");//1 specifies the first parameter in the query  
        myStmt1.setString(2,"srk");  
        myStmt1.setString(3,"jawan");  
  
        int i=myStmt1.executeUpdate();  
        System.out.println(i+" records inserted");  
        
        //perform UPDATE - update emp set name=? where Enroll=?"
        
       
        
        // Close the connection
        con.close();
    }
    }
    
