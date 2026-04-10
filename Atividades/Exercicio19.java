/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio19;
import javax.swing.JOptionPane;

public class Exercicio19 {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de vezes:"));
        String frase = JOptionPane.showInputDialog("Digite uma frase:");
    
        for (int i = 0; i < n; i++) {
            JOptionPane.showMessageDialog(null, "Frase: " + frase);
        }

    }
}
