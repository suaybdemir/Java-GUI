/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_examples;



import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author PC
 */
public class Main_Label {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ImageIcon image = new ImageIcon("Hello World.jpg ");
        
       Border border = BorderFactory.createLineBorder(Color.green,3);
        
        JLabel label = new JLabel();
        
        label.setText(" Merhabalar Efendim !");
        label.setIcon(image);
        
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0xF00000));
        label.setFont(new Font(" MV Boli",Font.BOLD,40));
        label.setIconTextGap(35);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(null);// null alters "border"
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 300,300);
        
        JFrame frame = new JFrame();
        
        frame.setTitle(" Label Uygulamasi ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);        
        frame.setVisible(true);
        frame.add(label);
        //frame.setLayout(null);  
        frame.pack();
        
        
        frame.setIconImage(image.getImage());
        
    }
    
}
