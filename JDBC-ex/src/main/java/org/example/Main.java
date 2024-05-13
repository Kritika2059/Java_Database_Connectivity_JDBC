package org.example;
import java.sql.*;

public class Main {

    public static void main(String args[]) throws SQLException {

        String sql = "select sname from student where sid = 5";
        String url = "jdbc:postgresql://localhost:5432/College";
        String username = "postgres";
        String password = "root";


        Connection con = DriverManager.getConnection(url,username, password);
        Statement st = con.createStatement();
        ResultSet rs =  st.executeQuery(sql);
        rs.next();
        String firstname = rs.getString("sname");
        System.out.println(firstname);

        con.close();

    }

}



