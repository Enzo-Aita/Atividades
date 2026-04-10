/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio13;
import javax.swing.JOptionPane;

public class Exercicio13 {

    public static void main(String[] args) {
        double sb, vp, lp;
        sb = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário Bruto: "));
        vp = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor da prestação: "));
        lp = sb * 0.3;
        if (vp <= lp) {
            JOptionPane.showMessageDialog(null, "Empréstimo Concedido! ");
        } else {
            JOptionPane.showMessageDialog(null, "Empréstimo NEGADO! ");
        }
    }
}
