/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizBidimensional;

import java.util.Scanner;


public class exercicosMatrizBidimensional1 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        
        int [][] brian = new int [2][2];
        int soma = 0;
        
        for (int i = 0; i < brian.length; i++){
            //System.out.println("Valores de I: " + "[" + i + "]");
            
            for (int j = 0; j < brian.length; j++){
                System.out.println("Valores de J: " + "[" + j + "]"+"[" + j + "]");
            
            brian[i][j] = teclado.nextInt();
           
            soma += brian[i][j];
            }
        }
    
        
        for  (int i = 0; i < brian.length; i++){
            for  (int j = 0; j < brian.length; j++)
                    
               
                System.out.println("Valores de Matriz Bi: " + brian[i][j]);
            
        }
        System.out.println("Soma é: " + soma);
        
    }
}
