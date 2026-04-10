
package com.mycompany.exercicio17;
import javax.swing.JOptionPane;

public class Exercicio17 {

    public static void main(String[] args) {
         String[] opcoes = {"Engenheiro", "Médico", "Programador", "Advogado", "Designer"};
         
         int escolha = JOptionPane.showOptionDialog(
         null,
                 "escolha a profissão de Pedro:",
                 "profissão de Pedro",
                 JOptionPane.DEFAULT_OPTION,
                 JOptionPane.INFORMATION_MESSAGE,
                 null,
                 opcoes,
                 opcoes[0]
                 
                 
         );
         
         String profissao;
         
         switch (escolha) {
             case 0:
                 profissao = "engenheiro";
                 break;
             case 1:
                 profissao = "médico";
                 break;
             case 2:
                 profissao = "programador";
                 break;
             case 3:
                 profissao = "advogado";
                 break;
             case 4:
                 profissao = "designer";
                 break;
             default:
                 profissao = "DESEMPREGADO";
                 break;
        }
         
         JOptionPane.showMessageDialog(null, "Pedro é " + profissao + ".");
        
    }
}
