/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persist;

import Model.M_Categoria;
import Model.M_Vaixell;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nmartinez
 */
public class P_VaixellDAO extends P_BaseDAO {
    
    public P_VaixellDAO() {
        this.connect();
    }
    
    public static void insertarVaixell(M_Vaixell vai) throws SQLException{
        PreparedStatement stm = conn.prepareStatement("INSERT INTO vaixells values(?,?,?,?,?,?,?,?);");
        stm.setInt(1, vai.getCodi());
        stm.setString(2, vai.getNom());
        stm.setString(3, vai.getCategoria().getNom());
        stm.setDouble(4, vai.getRating());
        stm.setString(5, vai.getClub());
        stm.setString(6, vai.getTipus());
        stm.setBoolean(7, vai.isSenior());
        stm.setDouble(8, vai.getTemps());
        stm.executeUpdate();
        stm.close();
    }
    public static void updateVaixell(M_Vaixell vai) throws SQLException{
        PreparedStatement stm = conn.prepareStatement("update vaixells set nom = ?, categoria = ?, rating = ?, club = ?, tipus = ?, senior = ?, temps = ? where codi=?;");
        stm.setString(1, vai.getNom());
        stm.setString(2, vai.getCategoria().getNom());
        stm.setDouble(3, vai.getRating());
        stm.setString(4, vai.getClub());
        stm.setString(5, vai.getTipus());
        stm.setBoolean(6, vai.isSenior());
        stm.setDouble(7, vai.getTemps());
        stm.setInt(8, vai.getCodi());
        stm.executeUpdate();
        stm.close();
    }
    public static boolean codiRepetit(int codi) throws SQLException{
        PreparedStatement stmt;
        String query;
        ResultSet rs;
        int cantidad=0;
        query = "Select count(*) as 'cantidad' from vaixells where codi = ?;";
        stmt = conn.prepareStatement(query);

        stmt.setInt(1, codi);

        rs = stmt.executeQuery();
        while (rs.next()) {
            cantidad=rs.getInt("cantidad");
        }
        stmt.close();
        rs.close();
        if (cantidad==0) {
            return false;
        } else{
            return true;
        }
    }
        
    public static M_Vaixell getVaixell(int codi) throws SQLException {
        PreparedStatement stmt;
        String query;
        ResultSet rs;
        M_Vaixell vaix = null;
        M_Categoria cat;
        query = "Select * from vaixells where codi = ?;";
        stmt = conn.prepareStatement(query);

        stmt.setInt(1, codi);

        rs = stmt.executeQuery();
        while (rs.next()) {
            vaix = new M_Vaixell();
            cat = new M_Categoria();
            vaix.setCodi(rs.getInt("codi"));
            vaix.setNom(rs.getString("nom"));
            cat.setNom(rs.getString("categoria"));
            vaix.setCategoria(cat);
            vaix.setRating(rs.getDouble("rating"));
            vaix.setClub(rs.getString("club"));
            vaix.setTipus(rs.getString("tipus"));
            vaix.setSenior(rs.getBoolean("senior"));
            vaix.setTemps(rs.getDouble("temps"));
        }
        stmt.close();
        rs.close();
        return vaix;
    }
    
    public static void deleteVaixell(int codi) throws SQLException{
        P_BaseDAO.connect();
        PreparedStatement stm;
        String query = "delete from vaixells where codi=?;";
        stm = conn.prepareStatement(query);
        stm.setInt(1, codi);
        stm.executeUpdate();
        stm.close();
    }
    
    public static ArrayList<M_Vaixell> getAllVaixell(String txt) throws SQLException {
        PreparedStatement stmt;
        String query;
        ResultSet rs;
        M_Vaixell vaix = null;
        M_Categoria cat;
        ArrayList<M_Vaixell> vaixells = new ArrayList<>();
        query = "Select codi,nom,categoria,rating,club,tipus,senior,temps,(temps*rating) as 'temps_compensat' from vaixells order by "+txt+" asc;";
        stmt = conn.prepareStatement(query);
        rs = stmt.executeQuery();
        while (rs.next()){
           vaix = new M_Vaixell();
           cat = new M_Categoria();
           vaix.setCodi(rs.getInt("codi"));
           vaix.setNom(rs.getString("nom"));
           cat.setNom(rs.getString("categoria"));
           vaix.setCategoria(cat);
           vaix.setRating(rs.getDouble("rating"));
           vaix.setClub(rs.getString("club"));
           vaix.setTipus(rs.getString("tipus"));
           vaix.setSenior(rs.getBoolean("senior"));
           vaix.setTemps(rs.getDouble("temps"));
           vaixells.add(vaix);
        }
        stmt.close();
        rs.close();
        return vaixells;
    }
    
}
