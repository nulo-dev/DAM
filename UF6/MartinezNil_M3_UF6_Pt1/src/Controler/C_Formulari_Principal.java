/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;


import Model.M_Categoria;
import View.V_Formulari_Principal;
import Model.M_Vaixell;
import Persist.P_BDutil;
import Persist.P_BaseDAO;
import Persist.P_CategoriaDAO;
import Persist.P_VaixellDAO;
import View.V_Formulari_Afegir;
import View.V_Formulari_Editar;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author nmartinez
 */
public class C_Formulari_Principal {
    
    private V_Formulari_Principal vfp;
    
    public C_Formulari_Principal() throws SQLException {
        this.vfp = new V_Formulari_Principal(this);
        this.vfp.setVisible(true);
        this.creacionBasic();
        this.mostraLlista("codi");
        this.vfp.meterCategoria();
    }
       
    public void mostraLlista(String txt) {
        TableModel tm = this.getVaixellTable(txt);
        vfp.setInfo(tm);
        vfp.setVisible(true);

    }
    
    public void mostrarAgregar(){
        V_Formulari_Afegir dialog = new V_Formulari_Afegir(this.vfp, true, this);
        dialog.setVisible(true);
    }
    public void mostrarEditar(int id){
        V_Formulari_Editar dialog = new V_Formulari_Editar(this.vfp, true, this,id);
        dialog.setVisible(true);
    }
    public void afegirVaixell(M_Vaixell vai){
        try {
            P_VaixellDAO.insertarVaixell(vai);
        } catch (SQLException ex) {
            Logger.getLogger(C_Formulari_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public TableModel getVaixellTable(String txt) {
        DefaultTableModel tm = new DefaultTableModel();
        tm.setRowCount(0);
        tm.addColumn("Codi");
        tm.addColumn("Nom");
        tm.addColumn("Categoria");
        tm.addColumn("Rating");
        tm.addColumn("Club");
        tm.addColumn("Tipus");
        tm.addColumn("Senior");
        tm.addColumn("Temps");
        tm.addColumn("Temps Compensat");
        try {
        ArrayList<M_Vaixell> vaixells = P_VaixellDAO.getAllVaixell(txt);
        for (M_Vaixell vai : vaixells) {
            Object[] fila = new Object[9]; 
            fila[0] = vai.getCodi();
            fila[1] = vai.getNom();
            fila[2] = vai.getCategoria().getNom();
            fila[3] = vai.getRating();
            fila[4] = vai.getClub();
            fila[5] = vai.getTipus();
            fila[6] = vai.isSenior();  
            fila[7] = vai.getTemps();
            fila[8] = String.format("%.2f",vai.getTemps()*vai.getRating());
            tm.addRow(fila);
        }
        } catch (SQLException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
            System.out.println("");
            System.out.println(e.getMessage());
        }   
        return tm;
    }
    
    public void creacionBasic() throws SQLException{
        M_Categoria cat = new M_Categoria("Crussier");
        M_Categoria cat2 = new M_Categoria("Perfomance");
        M_Categoria cat3 = new M_Categoria("High Level");
        M_Vaixell vaix1 = new M_Vaixell(1, "Falcon", cat3, 32.1, "Raxing", "Regata", true, 100);
        M_Vaixell vaix2 = new M_Vaixell(2, "Hiper", cat2, 45.5, "Fral", "creuer", true, 300);
        M_Vaixell vaix3 = new M_Vaixell(3, "Partol", cat, 12.8, "Fral", "creuer-regata", false, 120);
        M_Vaixell vaix4 = new M_Vaixell(4, "Kial", cat2, 15.8, "Club Dep", "Regata", false, 220);
        P_BaseDAO.connect();
        try{
        P_BDutil.creaEstructuraMysql();
        // P_BDutil.limpiarTablas();
        P_CategoriaDAO.insertarCategoria(cat);
        P_CategoriaDAO.insertarCategoria(cat2);
        P_CategoriaDAO.insertarCategoria(cat3);
        P_VaixellDAO.insertarVaixell(vaix1);
        P_VaixellDAO.insertarVaixell(vaix2);
        P_VaixellDAO.insertarVaixell(vaix3);
        P_VaixellDAO.insertarVaixell(vaix4);
        } catch(SQLException e) {
            
        }
    }
    
    
}