/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizUnidimencional;

import java.util.Scanner;

public class matrizUnidimencional3 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int [] matriz = new int [5];
        
        //Preenche os valores da Matriz
        for (int i = 0; i < matriz.length; i++){
        
            System.out.println("Digite os valores da Matriz: " + i);
            matriz[i] = teclado.nextInt();
            
            //System.out.println("Vaores da Matriz: " + matriz[i]);
        
        }
        
        //Imprime os valores da Matriz
        for(int i = 0; i < matriz.length; i++){
        
             System.out.println("Valores da Matriz: " + matriz[i]);
        
        
        }
        
        
    }
}
