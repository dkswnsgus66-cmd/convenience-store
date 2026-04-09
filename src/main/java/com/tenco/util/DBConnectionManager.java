package com.tenco.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {

    private static final String URL = "jdbc:mysql://localhost:3306/convenience_store?serverTimezone=Asia/Seoul";
    private static final String DB_USER = System.getenv("DB_USER");
    private static final String PASSWORD = System.getenv("DB_PASSWORD");



    public Connection getConnection(){
        Connection conn;
        {
            try {
                conn = DriverManager.getConnection(URL,DB_USER,PASSWORD);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return conn;
    }



}
