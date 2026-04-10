
package com.mycompany.exercicio21;
import javax.swing.JOptionPane;

public class Exercicio21 {

    public static void main(String[] args) {
       StringBuilder nPares = new StringBuilder("Numero pares entres 33 e 57: \n");
       
       for(int i = 33; i <= 57; i++) {
           
           if (i % 2 == 0) {
               nPares.append(i).append("\n"); 
            }
        }

        JOptionPane.showMessageDialog(null, nPares.toString());
    }
}
           
      
    

