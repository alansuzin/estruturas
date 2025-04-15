/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosMatriz;

import java.util.Scanner;


public class exerciciosMatriz9 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int [] numeros = new int [5];
                
        for (int i = 0; i > 5; i++){
        
            System.out.println("Contar quantos são menores que 50: ");
            numeros[i] = teclado.nextInt();
        }
        for (int i = 0; i < 5; i++){
            
            if (numeros[i] < 50) {
            
            System.out.println(numeros[i]);
        
        }
        }
    }
}
