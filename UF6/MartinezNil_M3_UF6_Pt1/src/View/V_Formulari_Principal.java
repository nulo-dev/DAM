/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author nmartinez
 */

import Controler.C_Formulari_Principal;
import Model.M_Categoria;
import Model.M_Vaixell;
import Persist.P_CategoriaDAO;
import Persist.P_VaixellDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class V_Formulari_Principal extends javax.swing.JFrame {

    /**
     * Creates new form V_Formulari_Principal
     */
    private C_Formulari_Principal cfp;
    
    public V_Formulari_Principal(C_Formulari_Principal cfp) throws SQLException {
        this.cfp = cfp;
        initComponents();
    }
    
    public void setInfo(TableModel tm){  
        LlistaVaixells.setModel(tm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        LlistaVaixells = new javax.swing.JTable();
        ComboBoxOrder = new javax.swing.JComboBox<>();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ButtonAgregar = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        ButtonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LlistaVaixells.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(LlistaVaixells);

        ComboBoxOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codi", "Temps" }));
        ComboBoxOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxOrderActionPerformed(evt);
            }
        });

        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });

        jLabel1.setText("Filtar por categoria:");

        jLabel2.setText("Ordenar por:");

        ButtonAgregar.setText("Agregar");
        ButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarActionPerformed(evt);
            }
        });

        ButtonEditar.setText("Editar");
        ButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarActionPerformed(evt);
            }
        });

        ButtonEliminar.setText("Eliminar");
        ButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBoxOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                        .addComponent(ButtonAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonEliminar)
                        .addGap(220, 220, 220))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonAgregar)
                            .addComponent(ButtonEditar)
                            .addComponent(ButtonEliminar))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(ComboBoxOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void ButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarActionPerformed
        cfp.mostrarAgregar();
    }//GEN-LAST:event_ButtonAgregarActionPerformed

    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed
        orderby();
    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed
    private void ListaCat(String order){
        ArrayList<M_Vaixell> vaixells = null;
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
            vaixells = P_VaixellDAO.getAllVaixell(order);
        } catch (SQLException ex) {
            Logger.getLogger(V_Formulari_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (M_Vaixell vai : vaixells) {
            if(jComboBoxCategoria.getSelectedIndex() == 0){
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
            } else if (jComboBoxCategoria.getSelectedItem().toString().equals(vai.getCategoria().getNom())){
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
        }
        LlistaVaixells.setModel(tm);
    }
    private void ComboBoxOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxOrderActionPerformed
        orderby();
    }//GEN-LAST:event_ComboBoxOrderActionPerformed
    private void orderby(){
        if (ComboBoxOrder.getSelectedItem().toString().equals("Codi")) {
            ListaCat("codi");
        } else if (ComboBoxOrder.getSelectedItem().toString().equals("Temps")){
            ListaCat("temps_compensat");
        }
    }
    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed
        int col = 0;
        int row = this.LlistaVaixells.getSelectedRow();
        int valor = 0;
        if (row > -1){
            valor = (int) this.LlistaVaixells.getValueAt(row, col);
        }
        try {
            if (row > -1) { 
                UIManager UI = new UIManager();
                UI.put("OptionPane.background",new ColorUIResource(56,105,159));
                UI.put("Panel.background",new ColorUIResource(56,105,159));
                UI.put("OptionPane.messageForeground",new ColorUIResource(255,255,255));
                 int seleccion = JOptionPane.showOptionDialog(
                            this,
                            "Eliminar vaixell con codigo: " + valor,
                            "Vol afegir eliminar aquest vaixell?",
                            JOptionPane.OK_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null, // null para icono por defecto.
                            new Object[]{"Si", "No"}, //, "No", "Si"}, // null para YES, NO y CANCEL
                            "Si");
                 if(seleccion == 0){
                    P_VaixellDAO.deleteVaixell(valor); 
                    JOptionPane.showOptionDialog(
                         this,
                         "Vaixell eliminat satisfactoriament.",
                         "Informació!",
                         JOptionPane.OK_OPTION,
                         JOptionPane.INFORMATION_MESSAGE,
                         null, // null para icono por defecto.
                         new Object[]{"Ok"}, //, "No", "Si"}, // null para YES, NO y CANCEL
                         "Ok");
                        cfp.mostraLlista("codi");
                 } else {
                    JOptionPane.showOptionDialog(
                         this,
                         "No ha eliminat el vaixell.",
                         "Informació!",
                         JOptionPane.OK_OPTION,
                         JOptionPane.ERROR_MESSAGE,
                         null, // null para icono por defecto.
                         new Object[]{"Ok"}, //, "No", "Si"}, // null para YES, NO y CANCEL
                         "Ok");
                 }
            } else {
                UIManager UI = new UIManager();
                UI.put("OptionPane.background",new ColorUIResource(56,105,159));
                UI.put("Panel.background",new ColorUIResource(56,105,159));
                UI.put("OptionPane.messageForeground",new ColorUIResource(255,255,255));
                JOptionPane.showOptionDialog(
                            this,
                            "Has de seleccionar un vaixell per eliminar.",
                            "¡ERROR!",
                            JOptionPane.OK_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null, // null para icono por defecto.
                            new Object[]{"Vale"}, //, "No", "Si"}, // null para YES, NO y CANCEL
                            "Vale");
            }
        } catch (SQLException ex) {
            Logger.getLogger(V_Formulari_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonEliminarActionPerformed

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed
        int col = 0;
        int row = this.LlistaVaixells.getSelectedRow();
        int valor = 0;
        if (row > -1){
           valor = (int) this.LlistaVaixells.getValueAt(row, col);
           cfp.mostrarEditar(valor);
        } else {
                UIManager UI = new UIManager();
                UI.put("OptionPane.background",new ColorUIResource(56,105,159));
                UI.put("Panel.background",new ColorUIResource(56,105,159));
                UI.put("OptionPane.messageForeground",new ColorUIResource(255,255,255));
                JOptionPane.showOptionDialog(
                            this,
                            "Has de seleccionar un vaixell per editar.",
                            "¡ERROR!",
                            JOptionPane.OK_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null, // null para icono por defecto.
                            new Object[]{"Vale"}, //, "No", "Si"}, // null para YES, NO y CANCEL
                            "Vale");
        }
        
    }//GEN-LAST:event_ButtonEditarActionPerformed

    public void meterCategoria() throws SQLException{
        ArrayList<M_Categoria> arrayCat = new ArrayList<M_Categoria>();
        arrayCat.addAll(P_CategoriaDAO.getAllCategoria());
        jComboBoxCategoria.addItem("Todos");
        for (int i = 0; i < arrayCat.size(); i++) {
            jComboBoxCategoria.addItem(arrayCat.get(i).getNom());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V_Formulari_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Formulari_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Formulari_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Formulari_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new V_Formulari_Principal(null).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(V_Formulari_Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgregar;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JComboBox<String> ComboBoxOrder;
    private javax.swing.JTable LlistaVaixells;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
