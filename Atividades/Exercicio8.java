/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio8;
import javax.swing.JOptionPane;

public class Exercicio8 {

    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro:");
        int numero1 = Integer.parseInt(input1);

        String input2 = JOptionPane.showInputDialog("Digite o segundo número inteiro:");
        int numero2 = Integer.parseInt(input2);

        int soma = numero1 + numero2;
        
        JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma);
    }
}
