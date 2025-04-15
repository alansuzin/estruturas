/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizUnidimencional;

import java.util.Scanner;


public class matrizEx2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int vetor [] = new int [5];
        
        for (int i = 0; i < vetor.length; i++){
        
            System.out.println("Digite os valores do Vetor: " + vetor[i]);
            vetor[i] = teclado.nextInt();
        
        }
        
        
    }
}
