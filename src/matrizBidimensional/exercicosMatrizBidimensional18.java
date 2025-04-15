/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizBidimensional;

import java.util.Scanner;


public class exercicosMatrizBidimensional18 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int [][] valor = new int [2][2];
        int resultado = 0;
        
        for (int i = 0; i < valor.length; i++){
            for (int j = 0; j < valor.length; j++){
                
                System.out.println("Valores da Matriz: " + i + " - " + j);
                valor[i][j] = teclado.nextInt();
            }
        }
        
        //Imprimir Matriz
        for (int i = 0; i < valor.length; i++){
            for (int j = 0; j < valor.length; j++){
                
               resultado = (valor[0][0] + valor[1][1]) - (valor[0][1] + valor[1][0]);
            }
        }
        
        System.out.println(resultado);
    }
}
