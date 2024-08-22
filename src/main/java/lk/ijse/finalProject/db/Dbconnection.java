package lk.ijse.finalProject.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
    private static Dbconnection dbconnection;
    private Connection connection;

    private Dbconnection() throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/us_cargo_freight_service",
                "root",
                "95334238Sd$"
        );
    }
    public static Dbconnection getInstance() throws SQLException {
       return dbconnection==null ? dbconnection = new Dbconnection() : dbconnection;
    }
    public Connection getConnection(){
        return connection;
    }
}
