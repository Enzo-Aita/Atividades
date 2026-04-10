/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio9;
import javax.swing.JOptionPane;

public class Exercicio9 {

    public static void main(String[] args) {
        String inputPeso = JOptionPane.showInputDialog("Digite o seu peso em kg (ex: 70):");
        int peso = Integer.parseInt(inputPeso);
      
        String inputAltura = JOptionPane.showInputDialog("Digite a sua altura em metros (ex: 1.75):");
        
        double altura = Double.parseDouble(inputAltura);
        
        double imc = peso / (altura * altura);

        JOptionPane.showMessageDialog(null, "Seu IMC é: " + String.format("%.2f", imc));
    

 
    }
}
