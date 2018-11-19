package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SetupDerbyDatabase {

    public static void main(String[] args) throws Exception {
        test1();
    }

    private static void test1() throws SQLException {
        String url = "jdbc:derby:zad1;create=true";
        Connection conn = DriverManager.getConnection(url);

        //Statement stmt = conn.createStatement();
        Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);

//        stmt.executeUpdate("CREATE TABLE animal ("
//                + "id INTEGER PRIMARY KEY, "
//                + "name VARCHAR(255))");

//        stmt.executeUpdate("INSERT INTO animal VALUES (1, 'African Elephant')");
//        stmt.executeUpdate("INSERT INTO animal VALUES (2, 'Zebra')");


        ResultSet rs = stmt.executeQuery("select * from animal");

        if (rs.next()) {
            System.out.println(rs.getObject(2));
        }
        //Class.forName()
//
//        rs.next();
//        System.out.println(rs.getInt(1));
    }

}
