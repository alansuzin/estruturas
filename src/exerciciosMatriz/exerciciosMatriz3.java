/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosMatriz;

import java.util.Scanner;


public class exerciciosMatriz3 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        float notas [] = new float [5];
        float media = 0;
        
        for (int i = 0; i <= 4; i++){
        
            System.out.println("Digite um valor: " + i);
            notas[i] = teclado.nextFloat();
            media = media + notas[i];
            
        }
        
        
        media = media /5;
        System.out.println("A media é: " + media);
        System.out.println("A media das notas é: ");
        for (int i = 0; i <= 4; i++){
            
            if (notas[i] > media)
            System.out.println(notas[i]);
        
        }
    }
}
