/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nmartinez
 */
public class P_BaseDAO {
    
    static final String url = "jdbc:mysql://localhost:3306/";
    static final String dbName = "M03Regata";                  //Nom de la nostra BBDD
    static final String driver = "com.mysql.cj.jdbc.Driver";
    static final String userName = "m03";
    static final String password = "m03password";
    protected static Connection conn = null;
    
    public static void connect() {
        if (conn == null) {
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url + dbName, userName, password);
            } catch (SQLException | ClassNotFoundException ex) {
                throw new ExceptionInInitializerError(ex);
            }
        }

    }
    
    public static Connection getConn() {
        return conn;
    }

    public static void close() throws SQLException {
        if (conn != null) {
            conn.close();
        }
        conn = null;
    }
    
}
