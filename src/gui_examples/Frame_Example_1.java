/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_examples;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author PC
 */
public class Frame_Example_1 extends JFrame  {
    
    Frame_Example_1()
    {
        ImageIcon image1 = new ImageIcon("Music_graph.jpg");
        
        JLabel label = new JLabel();
        label.setText(" Müzik Çalar");
        label.setIcon(image1);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x000000));
        label.setFont(new Font("FONT",Font.BOLD,30));
        label.setBackground(new Color(0xFF00FF));
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,500,500);
        
        
        this.setTitle(" Müzik Çalar");
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(label);
        this.pack();
        
       ImageIcon image = new ImageIcon("Music_player.png");
       this.setIconImage(image.getImage());
       //this.getContentPane().setBackground(new Color(0x333454));


        
    }
    
}


