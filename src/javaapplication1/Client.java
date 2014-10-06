/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author student_U487
 */
public class Client  {



  // Create a form with the specified labels, tooltips, and sizes.

    public static void createMenu(){
    JButton recepty = new JButton("Wprowadz recepte");
    JButton leki = new JButton("Wprowadz lek");
    JButton transakcje = new JButton("Wprowadz transakcje");

    
    
    
    final JFrame f = new JFrame("SQL client");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel p = new JPanel();
    p.add(recepty);
    p.add(leki);
    p.add(transakcje);
    f.getContentPane().add(p, BorderLayout.SOUTH);
    f.pack();
    f.setVisible(true);
    
    recepty.addActionListener(new ActionListener() {
        @Override
      public void actionPerformed(ActionEvent e) {
            f.setVisible(false); //you can't see me!
            f.dispose(); //Destroy the JFrame object
      }
    });
    
    leki.addActionListener(new ActionListener() {
        @Override
      public void actionPerformed(ActionEvent e) {
            f.setVisible(false); //you can't see me!
            f.dispose(); //Destroy the JFrame object 
      }
    });
     transakcje.addActionListener(new ActionListener() {
        @Override
      public void actionPerformed(ActionEvent e) {
            f.setVisible(false); //you can't see me!
            f.dispose(); //Destroy the JFrame object 
      }
    });
    }
    

  public static void main(String[] args) {
    MysqlHandler.PrzypiszDane("127.0.0.1", "3306", "root", "");
    createMenu();
  }
}
