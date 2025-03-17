/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proje_socialmedia;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevser
 */
public class Frm_login extends javax.swing.JFrame {
   public static String name_surname;
 //static oluşturdum çünkü diğer clasda görmek için 
    /**
     * Creates new form Frm_login
     */
    public Frm_login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        btn_register = new javax.swing.JButton();
        txt_login_UserName = new javax.swing.JTextField();
        txt_login_password = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("User Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, -1));

        btn_login.setBackground(new java.awt.Color(255, 204, 204));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel2.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 140, 80));

        btn_register.setBackground(new java.awt.Color(255, 204, 204));
        btn_register.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_register.setText("Register");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        jPanel2.add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 150, 80));

        txt_login_UserName.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.add(txt_login_UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 150, -1));

        txt_login_password.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.add(txt_login_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 150, -1));

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Frm_Register frm_Register = new Frm_Register(this);
        frm_Register.setVisible(true);
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
         name_surname = txt_login_UserName.getText();//getTEX ile yazılan ismi aldım
        String password = txt_login_password.getText();
        Person person = Social_MediaDB.Login(name_surname, password);
        if(person!=null){
            JOptionPane.showMessageDialog(rootPane, "GİRİŞ YAPTINIZ");
            this.setVisible(false);
            Frm_UserPage frm_Main = new Frm_UserPage(person);
            frm_Main.setVisible(true);
         //diğer frame açabilmek için
              
        }else{//EĞER GİRİŞ YAPILAMAZSA BU MESAJI EKRANA YAZDIRMAK İÇİN KULLANDIM JOPTİNPANE
             JOptionPane.showMessageDialog(rootPane, "KAYIT OLUNUZ");
        }
      
    }//GEN-LAST:event_btn_loginActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_login_UserName;
    private javax.swing.JTextField txt_login_password;
    // End of variables declaration//GEN-END:variables
}
