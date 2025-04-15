/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosMatriz;

import java.util.Scanner;


public class exerciciosMatriz2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int vetor [] = new int [5];
        int soma = 0;
        
        vetor [0] = 50;
        vetor [1] = 26;
        vetor [2] = 51;
        vetor [3] = 18;
        vetor [4] = 39;
        
        for (int i = 0; i < vetor.length; i++){
        
            System.out.println("Digite os valores do Vetor: " + vetor[i]);
            vetor[i] = teclado.nextInt();
        
        }
        for (int i = 0; i < vetor.length; i++){
        
            System.out.println("Digite os valores: " + soma);
            soma += vetor[i];
        }
        
    }
}