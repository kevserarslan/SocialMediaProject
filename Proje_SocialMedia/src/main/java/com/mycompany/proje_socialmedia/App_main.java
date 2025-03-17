/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.proje_socialmedia;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Kevser
 */
public class App_main {

    public static JFrame LoginFrame;

    public static void main(String[] args) {
      
        Frm_login newFrm = new Frm_login();
        LoginFrame = newFrm;
        newFrm.setVisible(true);
     
    }
}
