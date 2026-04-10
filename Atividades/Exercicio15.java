/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio15;
import javax.swing.JOptionPane;

public class Exercicio15 {

    public static void main(String[] args) {
       String nome = JOptionPane.showInputDialog("Digite sue nome: ");
       
        String idadeStr = JOptionPane.showInputDialog("Digite sua idade");
        int  idade = Integer.parseInt(idadeStr);
        
        if ( idade >= 18 && idade <=25){
            JOptionPane.showMessageDialog(null, nome + ": ACEITA");
         } else {
            JOptionPane.showMessageDialog(null, nome + ": NÃO ACEITA");
            
        }
       
    }
}
