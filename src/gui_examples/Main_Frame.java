/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_examples;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class Main_Frame extends JFrame {

    Main_Frame()
    {
        this.setTitle(" Türkiye ");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        
        ImageIcon image =  new ImageIcon("logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0xFF0000));
        
    }

}
