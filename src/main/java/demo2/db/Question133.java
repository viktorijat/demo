package demo2.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question133 {

    private static void populate() throws SQLException {
        String url = "jdbc:derby:question133;create=true";
        Connection conn = DriverManager.getConnection(url);

        Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);

        stmt.executeUpdate("CREATE TABLE Employee (ID INTEGER PRIMARY KEY)");

        stmt.executeUpdate("INSERT INTO Employee VALUES (1)");
        stmt.executeUpdate("INSERT INTO Employee VALUES (6)");
        stmt.executeUpdate("INSERT INTO Employee VALUES (3)");
        stmt.executeUpdate("INSERT INTO Employee VALUES (9)");
        stmt.executeUpdate("INSERT INTO Employee VALUES (2)");
        stmt.executeUpdate("INSERT INTO Employee VALUES (11)");

        stmt.close();
        conn.close();
    }

    private static void select() throws SQLException {

        String url = "jdbc:derby:question133;create=true";
        Connection conn = DriverManager.getConnection(url);
        String query = "select id from Employee";

        try (Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery(query);
            stmt.executeQuery("select id from Customer");

            while (rs.next()) {
                System.out.println("Employee ID: " + rs.getInt("id"));
            }
        } catch (SQLException se) {
            System.out.println("Error");
            se.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
        //populate();
        select();
    }
}
