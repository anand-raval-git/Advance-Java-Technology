/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author student
 */
public class validateinput extends HttpServlet {

    public static boolean checkUser(String u, String p) {
        boolean st = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            PreparedStatement ps = con.prepareStatement("select * from login where username=? and password =?");
            ps.setString(1, u);
            ps.setString(2, p);
            ResultSet rs = ps.executeQuery();
            st = rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return st;

    }
}
