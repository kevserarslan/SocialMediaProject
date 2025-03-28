/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proje_socialmedia;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevser
 */
public class Frm_Main_Ilgialanlari extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Main_IlgiAlanları
     */
    Person user;
    Person ilgialani;
    DefaultTableModel tbl_ilgialanları_model;
    DefaultTableModel tbl_selectedilgialanları_model;
//poliformizim yaparak tüm bilgileri yolladım
    public Frm_Main_Ilgialanlari(Person user) {
        initComponents();
        this.user = user;
        this.ilgialani=ilgialani;
        tbl_ilgialanları_model = new DefaultTableModel();
        tbl_ilgialanları_model.setColumnIdentifiers(new Object[]{"ID", "NAME"});
        tbl_ilgialanları.setModel(tbl_ilgialanları_model);
        tbl_selectedilgialanları_model= new DefaultTableModel();
     tbl_selectedilgialanları_model.setColumnIdentifiers(new Object[]{"ID", "NAME"});
       tbl_selected.setModel(tbl_ilgialanları_model);
        SetilgialanlarıToTable();
        
    }

    private void SetilgialanlarıToTable() {
        ArrayList<ilgialani> ilgialanları = Social_MediaDB.GetIlgialanları();
    tbl_ilgialanları_model.setRowCount(0);
        for (ilgialani ilgialanı : ilgialanları) {
            tbl_ilgialanları_model.addRow(new Object[]{ilgialanı.id,ilgialanı.name});
        }
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ilgialanları = new javax.swing.JTable();
        btn_add_ilgialanlarıtable = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_selected = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jTabbedPane1.setBackground(new java.awt.Color(255, 204, 204));
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(tbl_ilgialanları);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 31, 229, 251));

        btn_add_ilgialanlarıtable.setBackground(new java.awt.Color(153, 153, 255));
        btn_add_ilgialanlarıtable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_add_ilgialanlarıtable.setText("ADD");
        btn_add_ilgialanlarıtable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_ilgialanlarıtableActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add_ilgialanlarıtable, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 31, -1, -1));

        btn_cancel.setBackground(new java.awt.Color(153, 153, 255));
        btn_cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 255, -1, -1));

        jTabbedPane1.addTab("İlgialanıyönetimi", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_selected.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_selected);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 380));

        jTabbedPane1.addTab("ilgialanları", jPanel2);

        getContentPane().add(jTabbedPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Frm_UserPage frm_UserPage = new Frm_UserPage(user);
        frm_UserPage.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_add_ilgialanlarıtableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_ilgialanlarıtableActionPerformed
        // TODO add your handling code here:
        if(tbl_ilgialanları.getSelectedRow()<0)
        return;
        int id_ilgialan =Integer.parseInt(tbl_ilgialanları_model.getValueAt(tbl_ilgialanları.getSelectedRow(), 0).toString());

        Social_MediaDB.AddIlgialanlarıToPersonById(this.user.id, id_ilgialan);
    }//GEN-LAST:event_btn_add_ilgialanlarıtableActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Main_Ilgialanlari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Main_Ilgialanlari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Main_Ilgialanlari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Main_Ilgialanlari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Main_Ilgialanları().setVisible(true);
            }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Main_Ilgialanları().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_ilgialanlarıtable;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_ilgialanları;
    private javax.swing.JTable tbl_selected;
    // End of variables declaration//GEN-END:variables

}
