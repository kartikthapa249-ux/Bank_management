package bank_management;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection(
                    "jdbc:mysql:///bankmanagementsystem",
                    "root",
                    "1234");

            s = c.createStatement();

            System.out.println("Database Connected");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}