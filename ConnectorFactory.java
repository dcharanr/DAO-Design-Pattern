package com.tap.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorFactory {
    static Connection con = null;
    static String url = "jdbc:mysql://localhost:3306/employee";
    static String un = "root";
    static String pwd = "root";

    static public Connection requestConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, un, pwd);
        return con;
    }
}
