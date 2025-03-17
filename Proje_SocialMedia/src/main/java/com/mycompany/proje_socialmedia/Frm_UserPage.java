/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proje_socialmedia;

import javax.swing.ImageIcon;

/**
 *
 * @author Kevser
 */
public class Frm_UserPage extends javax.swing.JFrame {
    /**
     * Creates new form Frm_Main
     */
    Person user;

    public Frm_UserPage(Person user) {
        this.user = user;

        initComponents();
txt_Userpage_userName.setText(Frm_login.name_surname);

        ImageIcon iconLOGO = new ImageIcon("C:\\Users\\Kevser\\OneDrive\\Masaüstü\\bfddaf15-7646-4467-969f-3c5b166bcf06.jpg");
        lbl_profile.setIcon(iconLOGO);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_Userpage_userName = new javax.swing.JTextField();
        btn_İlgiAlanıYönetimi = new javax.swing.JButton();
        btn_Takipçi = new javax.swing.JButton();
        btn_Takip = new javax.swing.JButton();
        lbl_profile = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 153));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Userpage_userName.setBackground(new java.awt.Color(153, 153, 153));
        txt_Userpage_userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Userpage_userNameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_Userpage_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 146, -1));

        btn_İlgiAlanıYönetimi.setBackground(new java.awt.Color(204, 204, 204));
        btn_İlgiAlanıYönetimi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_İlgiAlanıYönetimi.setText("İlgi alanı yönetimi");
        btn_İlgiAlanıYönetimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_İlgiAlanıYönetimiActionPerformed(evt);
            }
        });
        jPanel2.add(btn_İlgiAlanıYönetimi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 160, -1));

        btn_Takipçi.setBackground(new java.awt.Color(204, 204, 204));
        btn_Takipçi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Takipçi.setText("takip istekleri");
        btn_Takipçi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TakipçiActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Takipçi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 160, 23));

        btn_Takip.setBackground(new java.awt.Color(204, 204, 204));
        btn_Takip.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Takip.setText("Takipçi");
        jPanel2.add(btn_Takip, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 110, 23));
        jPanel2.add(lbl_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 260, 270));

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "gönderiler ", "beğeniler", "engelenenler", "kısıtlananlar" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 160, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("*Ayarlar*");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_TakipçiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TakipçiActionPerformed
        // TODO add your handling code here:
        
        Frm_Follower frm_Follower = new Frm_Follower();
        frm_Follower.setVisible(true);

    }//GEN-LAST:event_btn_TakipçiActionPerformed

    private void btn_İlgiAlanıYönetimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_İlgiAlanıYönetimiActionPerformed

        this.setVisible(false);
        // TODO add your handling code here:
        Frm_Main_Ilgialanlari frm_Main_User = new Frm_Main_Ilgialanlari(this.user);
        frm_Main_User.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_İlgiAlanıYönetimiActionPerformed

    private void txt_Userpage_userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Userpage_userNameActionPerformed
        this.user = user;
        this.txt_Userpage_userName.setText(user.name_surname);
        this.setLocationRelativeTo(null);
         
        // String temp = lbl_1.getText();
        //lbl_1.setText(lbl_2.getText());
        // lbl_2.setText(temp);

    }//GEN-LAST:event_txt_Userpage_userNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Takip;
    private javax.swing.JButton btn_Takipçi;
    private javax.swing.JButton btn_İlgiAlanıYönetimi;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_profile;
    private javax.swing.JTextField txt_Userpage_userName;
    // End of variables declaration//GEN-END:variables
}
