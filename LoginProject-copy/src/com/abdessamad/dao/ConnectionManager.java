package com.abdessamad.dao;

import java.sql.*;
public class ConnectionManager
{
static Connection con;

private ConnectionManager() {

}

public static Connection getConnection() {

     con = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/login?serverTimezone=UTC";
        con = DriverManager.getConnection(url, "root","abdess.123" );
 

    } catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
    }
    return con;
}
}