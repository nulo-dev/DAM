/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author nmartinez
 */
public class P_BDutil {
    
    public static void creaEstructuraMysql() throws SQLException{
        P_BaseDAO.connect();
        Connection conn = P_BaseDAO.getConn();
        PreparedStatement stm;
        String query = "CREATE TABLE if not exists categorias (nom VARCHAR(100), " +
                "PRIMARY KEY(nom));";
        stm = conn.prepareStatement(query);
        stm.executeUpdate();
        stm.close();
        query = "CREATE TABLE if not exists vaixells (codi INTEGER, nom VARCHAR(100), categoria VARCHAR(100), rating DECIMAL(10,5),  "+
                       "club VARCHAR(50) , tipus VARCHAR(15), senior BOOLEAN ,temps DECIMAL(10,5), PRIMARY KEY(codi), FOREIGN KEY (categoria) References categorias(nom));";
        stm = conn.prepareStatement(query);
        stm.executeUpdate();
        stm.close();
    }
    
    public static void limpiarTablas() {
        P_BaseDAO.connect();
        Connection conn = P_BaseDAO.getConn();
        PreparedStatement stm;
        try {
            String query = "delete from vaixells;";
            stm = conn.prepareStatement(query);
            stm.executeUpdate();
            stm.close();
            stm = conn.prepareStatement("delete from categorias;");
            stm.executeUpdate();
            stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
