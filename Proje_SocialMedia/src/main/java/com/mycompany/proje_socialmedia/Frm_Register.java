/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proje_socialmedia;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevser
 */
public class Frm_Register extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Register
     */
    JFrame parentFrame;

    public Frm_Register(JFrame parentFrame) {
        initComponents();
        this.parentFrame = parentFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_user_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        btn_register = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        rdnbtn_female = new javax.swing.JRadioButton();
        rdnbtn_male = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 120, -1));

        txt_password.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 152, 190, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("User Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, -1));

        txt_user_name.setBackground(new java.awt.Color(204, 204, 255));
        txt_user_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_user_nameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 190, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Mail");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 90, -1));

        txt_mail.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 190, -1));

        btn_register.setBackground(new java.awt.Color(51, 51, 255));
        btn_register.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_register.setText("Register");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 110, 60));

        btn_cancel.setBackground(new java.awt.Color(51, 51, 255));
        btn_cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 120, 60));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Gender");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        rdnbtn_female.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(rdnbtn_female);
        rdnbtn_female.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rdnbtn_female.setText("Female");
        jPanel1.add(rdnbtn_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        rdnbtn_male.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(rdnbtn_male);
        rdnbtn_male.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rdnbtn_male.setText("Male");
        jPanel1.add(rdnbtn_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        App_main.LoginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        // TODO add your handling code here:
        try {
            Pattern pattern = Pattern.compile("^([a-z]|[A-Z]){2,15}_{1}([a-z]|[A-Z]){2,15}$");
            Matcher matcher = pattern.matcher(txt_user_name.getText());
            if (!matcher.find()) {
              throw new Exception("Geçersiz kullanıcı ismi,tekrar deneyiniz");
            }
           pattern = Pattern.compile("^([a-z]+\\w*){3,20}@{1}((gmail)|(hotmail)){1}(.com){1}$");
            matcher=pattern.matcher(txt_mail.getText());
               if (!matcher.find()) {
              throw new Exception("Geçersiz email,tekrar deneyiniz");
            }
               pattern=Pattern.compile("^(?=.{8,32}$)");
               matcher=pattern.matcher(txt_password.getText());
                  if (!matcher.find()) {
              throw new Exception("Geçersiz şifre,tekrar deneyiniz");
            }
               
            
//OBJE OLUŞTURDUM PERSON CLAASINDAN
            Person newp = new Person();
//İSİM EMAİL PASSWORD VE GENDERI ÇEKTİM
            newp.email = txt_mail.getText();
            newp.name_surname = txt_user_name.getText();

            newp.password = txt_password.getText();
            if (rdnbtn_male.isSelected()) {
                newp.gender = Person.Gender.Male;
            } else {
                newp.gender = Person.Gender.Famale;
            }

            if (Social_MediaDB.AddPerson(newp)) {
                JOptionPane.showMessageDialog(rootPane, "KAYIT OLDUNUZ");
            } else {
                JOptionPane.showMessageDialog(rootPane, "TEKRAR DENEYİNİZ");

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }


    }//GEN-LAST:event_btn_registerActionPerformed

    private void txt_user_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_user_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_user_nameActionPerformed
    /*
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_register;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdnbtn_female;
    private javax.swing.JRadioButton rdnbtn_male;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_user_name;
    // End of variables declaration//GEN-END:variables
}
