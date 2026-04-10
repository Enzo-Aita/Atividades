
package com.mycompany.exercicio11;

import javax.swing.JOptionPane;
public class Exercicio11 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número inteiro:");
        int numero = Integer.parseInt(input);
        
         if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é múltiplo de 2 (é par).");
        } else {
             
               JOptionPane.showMessageDialog(null, "O número " + numero + " NÃO é múltiplo de 2 (é ímpar).");
         }
        
    }
}
