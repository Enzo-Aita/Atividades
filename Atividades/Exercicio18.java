/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio18;

import javax.swing.JOptionPane;

public class Exercicio18 {

    public static void main(String[] args) {

        String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente:");

        String precoInput = JOptionPane.showInputDialog("Digite o preço do produto:");
        double preco = Double.parseDouble(precoInput);

        String categoriaInput = JOptionPane.showInputDialog("Digite a categoria do produto (A, B, C, D ou E):");
        char categoria = categoriaInput.toUpperCase().charAt(0);

        double desconto = 0;

        switch (categoria) {
            case 'A':
                desconto = 0.10; 
                break;
            case 'B':
                desconto = 0.15; 
                break;
            case 'C':
                desconto = 0.20; 
                break;
            case 'D':
                desconto = 0.25; 
                break;
            case 'E':
                desconto = 0.50; 
                break;
            default:
                JOptionPane.showMessageDialog(null, "Categoria inválida. Nenhum desconto será aplicado.");
                break;
        }
        
         double precoFinal = preco * (1 - desconto);
         
         
         String mensagem = String.format("Cliente: %s\nPreço original: R$ %.2f\nCategoria: %c\nDesconto: %.0f%%\nPreço final: R$ %.2f",
                                        nomeCliente, preco, categoria, desconto * 100, precoFinal);
        JOptionPane.showMessageDialog(null, mensagem);
        

    }
}
