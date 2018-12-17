package exam4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Question1 {

    public static void main(String[] args) throws SQLException {
        String url = "jdbs:derby:testdb;create=true";
        Connection conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement();
        stmt.execute("create database testdb");
    }
}
