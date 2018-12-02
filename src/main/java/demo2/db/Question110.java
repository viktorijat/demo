package demo2.db;

import java.sql.*;

public class Question110 {

    static String url = "jdbc:derby:question133;create=true";
    static Connection newConnection = null;

    private static void populate() throws SQLException {

        Connection conn = DriverManager.getConnection(url);

        Statement stmt = conn.createStatement();

//        stmt.executeUpdate("CREATE TABLE Student ("
//                + "id INTEGER PRIMARY KEY, "
//                + "name VARCHAR(100)"
//                + ")" );


        stmt.executeUpdate("INSERT INTO Student VALUES (102, 'kelvin')");

        stmt.close();
        conn.close();
    }

    private static void select() throws SQLException {

    String url = "jdbc:derby:question133;create=true";
    Connection conn = DriverManager.getConnection(url);

        try (Statement stmt = conn.createStatement()) {

        ResultSet rs = stmt.executeQuery("select * from Student");
        while (rs.next()) {
            System.out.println("Student ID: " + rs.getInt("id"));
            System.out.println("Student name: " + rs.getString("name"));
        }
    } catch (SQLException se) {
        System.out.println("Error");
        se.printStackTrace();
    }
}

    public static Connection getDBCOnnection() throws SQLException {

        try (Connection con = DriverManager.getConnection(url)) {
            newConnection = con;
        }
        return newConnection;
    }

    public static void main(String[] args) throws SQLException {

        getDBCOnnection();

        Statement st = newConnection.createStatement();
        st.executeUpdate("INSERT INTO Student VALUES (103, 'kelvin')");

        //populate();
        select();
    }
}
