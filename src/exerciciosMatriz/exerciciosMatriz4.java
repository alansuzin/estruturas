/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosMatriz;

import java.util.Scanner;


public class exerciciosMatriz4 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);   
        
        int pares = 0;
        
        for (int i = 0; i < 5; i++) {
            
            System.out.print("Digite um número: ");
            
        if (teclado.nextInt() % 2 == 0) pares++;
        
        }
        
            System.out.println("Pares: " + pares);  
            
    }    
}

