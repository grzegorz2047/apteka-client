/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JButton;

/**
 *
 * @author student_U487
 */
public class InsertDataForm {
    
    public void createForm(String[] labels, char[] mnemonics, int[] widths,String[] descs){
        
        final TextForm form = new TextForm(labels, mnemonics, widths, descs);
        
        JButton submit = new JButton("Wyslij zapytanie");

        
    }
    
}
