/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio14;
import javax.swing.JOptionPane;

public class Exercicio14 {

    public static void main(String[] args) {
        String inputNascimento = JOptionPane.showInputDialog("Digite o ano de nascimento:");
        int anoNascimento = Integer.parseInt(inputNascimento);

        // Solicitar o ano atual
        String inputAtual = JOptionPane.showInputDialog("Digite o ano atual:");
        int anoAtual = Integer.parseInt(inputAtual);

        // Verificar se o ano de nascimento é válido
        if (anoNascimento < anoAtual) {
            int idade = anoAtual - anoNascimento;
            JOptionPane.showMessageDialog(null, 
                "Sua idade é: " + idade + " anos.",
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, 
                "Ano de nascimento inválido! Deve ser menor que o ano atual.",
                "Erro",
                JOptionPane.ERROR_MESSAGE);
   
    }
              }
}
    

