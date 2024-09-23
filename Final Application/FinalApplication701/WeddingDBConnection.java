package com.Evergent.CoreJava.Rakesh.FinalApplication701;


import java.sql.Connection;
import java.sql.DriverManager;

public class WeddingDBConnection {
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/weddingmanagementdb", "root", "admin");
    }
}