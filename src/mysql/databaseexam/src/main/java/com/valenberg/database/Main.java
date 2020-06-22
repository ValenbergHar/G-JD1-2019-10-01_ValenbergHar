package com.valenberg.database;



import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static final String URL =  "jdbc:mysql://localhost:3306/mydbtest?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true" +
            "&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";
//"jdbc:mysql://localhost:3306/mydbtest";
    public static void main(String[] args) throws SQLException {
        Connection connection;

        try {

            connection= DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("Соединение с БД установлено");
            }
            connection.close();
            if (connection.isClosed()) {
                System.out.println("Соединение с БД закрыто");
            }
        } catch (SQLException e) {
            System.out.println("Соединение с БД не установлено");
        }


    }
}
