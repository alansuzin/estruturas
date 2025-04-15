/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosMatriz;

import java.util.Scanner;


public class exerciciosMatriz6 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int[] numeros = new int[3];
        
        for (int i = 0; i < 3; i++) {
            
            System.out.print("Digite um número: ");
            numeros[i] = teclado.nextInt();
            
        }
        
        for (int num : numeros) {
            
            System.out.println(num);
            
        }
    }    
}
