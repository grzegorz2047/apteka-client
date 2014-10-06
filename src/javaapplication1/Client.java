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

    recepty.addActionListener(new ActionListener() {
        @Override
      public void actionPerformed(ActionEvent e) {
             
      }
    });
    
    leki.addActionListener(new ActionListener() {
        @Override
      public void actionPerformed(ActionEvent e) {
             
      }
    });
     transakcje.addActionListener(new ActionListener() {
        @Override
      public void actionPerformed(ActionEvent e) {
             
      }
    });
    
    
    
    JFrame f = new JFrame("SQL client");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel p = new JPanel();
    p.add(recepty);
    p.add(leki);
    p.add(transakcje);
    f.getContentPane().add(p, BorderLayout.SOUTH);
    f.pack();
    f.setVisible(true);
    }
    

  public static void main(String[] args) {
    MysqlHandler.PrzypiszDane("127.0.0.1", "3306", "root", "");
    createMenu();
    /*String[] labels = { "Imie", "Nazwisko", "Tytul" };
    char[] mnemonics = { 'F', 'L', 'A' };
    int[] widths = { 15, 15, 14 };
    String[] descs = { "First Name", "Last Name", "Tytul" };

    final TextForm form = new TextForm(labels, mnemonics, widths, descs);

    JButton submit = new JButton("Wyslij zapytanie");

    submit.addActionListener(new ActionListener() {
        @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println(form.getText(0) + " " + form.getText(1) + ". " + form.getText(2)
           );
        if(form.getText(1).isEmpty() || form.getText(0).isEmpty()){
            JOptionPane.showMessageDialog(form,
            "uzupelnij pola!",
            "Nieuzupelnione pola",
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!form.getText(2).equals("mgr") && !form.getText(2).equals("tech")){
            JOptionPane.showMessageDialog(form,
            "Tytul moze byc tylko tech albo mgr!",
            "Zla nazwa w polu tytul",
            JOptionPane.ERROR_MESSAGE);
            return;
        }
            try {
                MysqlHandler.dodajRekordPracownik(form.getText(0),form.getText(1), form.getText(2));
                JOptionPane.showMessageDialog(form,
                "Wprowadzono rekord do bazy!",
                "Informacja",
                JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                System.out.println("Blad przy dodawaniu pracownika!");
                ex.printStackTrace();
            }
      }
    });

    JFrame f = new JFrame("SQL client");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.getContentPane().add(form, BorderLayout.NORTH);
    JPanel p = new JPanel();
    p.add(submit);
    f.getContentPane().add(p, BorderLayout.SOUTH);
    f.pack();
    f.setVisible(true);*/
  }
}
