package com.mycompany.exercicio25;

import javax.swing.JOptionPane;

public class Exercicio25 {

    public static void main(String[] args) {

        int[] numeros = new int[20];
        int soma = 0;
        double media;

        for (int i = 0; i < 20; i++) {
            String input = JOptionPane.showInputDialog(
                    "Digite o " + (i + 1) + "º número inteiro:");

            numeros[1] = Integer.parseInt(input);

            soma += numeros[1];

            media = (double) soma / 20;

            JOptionPane.showMessageDialog(null, "soma dos nuemros: " + soma + "\n" + " media arimetica" + media, "resultados", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
