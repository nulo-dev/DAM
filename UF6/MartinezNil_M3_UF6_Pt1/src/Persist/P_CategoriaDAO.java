/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persist;

import Model.M_Categoria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nmartinez
 */
public class P_CategoriaDAO extends P_BaseDAO{
    
    public P_CategoriaDAO() {
        this.connect();
    }
    
    public static void insertarCategoria(M_Categoria cat) throws SQLException{
        PreparedStatement stm = conn.prepareStatement("INSERT INTO categorias values(?);");
        stm.setString(1, cat.getNom());
        stm.executeUpdate();
        stm.close();
    }
    
    public static M_Categoria getCategoria(String nom) throws SQLException {
        PreparedStatement stmt;
        String query;
        ResultSet rs;
        M_Categoria cat = null;
        query = "Select * from categorias where nom = ?;";
        stmt = conn.prepareStatement(query);

        stmt.setString(1, nom);

        rs = stmt.executeQuery();
        while (rs.next()) {
            cat = new M_Categoria();
            cat.setNom(rs.getString("categoria"));
        }
        return cat;
    }
    
    public static ArrayList<M_Categoria> getAllCategoria() throws SQLException {
        PreparedStatement stmt;
        String query;
        ResultSet rs;
        M_Categoria cat = null;
        ArrayList<M_Categoria> categorias = new ArrayList<>();
        query = "Select * from categorias;";
        stmt = conn.prepareStatement(query);
        rs = stmt.executeQuery();
        while (rs.next()){
           cat = new M_Categoria();
           cat.setNom(rs.getString("nom"));
           categorias.add(cat);
        }
        stmt.close();
        rs.close();
        return categorias;
    }
    
}
