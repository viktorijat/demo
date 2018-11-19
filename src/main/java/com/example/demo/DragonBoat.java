package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.stream.IntStream;

public class DragonBoat {

    public static DragonBoat boat;

    public static void row() {
    }

    public static void race() {
        boat = new DragonBoat();
        IntStream.range(1, 100).forEach(i -> boat.row());
    }


    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        Statement stmt = conn.createStatement();
        int result = stmt.executeUpdate("select * from food");
        System.out.println(result);

    }
}