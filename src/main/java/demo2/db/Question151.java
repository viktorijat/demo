package demo2.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question151 {

    private static void populate() throws SQLException {
        String url = "jdbc:derby:question136;create=true";
        Connection conn = DriverManager.getConnection(url);

        Statement stmt = conn.createStatement();

        stmt.executeUpdate("CREATE TABLE Employee ("
                + "EID INTEGER PRIMARY KEY, "
                + "ENAME VARCHAR(100))"
                );

        stmt.executeUpdate("INSERT INTO Employee VALUES (111, 'Tom')");
        stmt.executeUpdate("INSERT INTO Employee VALUES (112, 'Jerry')");
        stmt.executeUpdate("INSERT INTO Employee VALUES (113, 'Donald')");

        stmt.close();
        conn.close();
    }

    private static void select() {

        String url = "jdbc:derby:question136;create=true";

        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.execute("select * from Employee");
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                if (rs.getInt(1) == 112) {
                    rs.updateString(1, "Jack");
                }

                rs.absolute(2);
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
                break;
            }

//            while (rs.next()) {
//                System.out.println(rs.getInt("eid"));
//                System.out.println(rs.getString("ename"));
//
//            }
        } catch (SQLException se) {
            System.out.println("Exception is raised");
        }
    }

    public static void main(String[] args) throws SQLException {
        //populate();
        select();
    }
}
