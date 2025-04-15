/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaRepeticaoWhile;

import java.util.Scanner;


public class estruturaRepeticaoWhile5 {
        public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);    
            
        int i = 1;
        float notas;
        float soma = 0;
        
        while(i <= 4){
        
            System.out.println("Digite a Nota " + i);
            notas = teclado.nextFloat();
            
            soma += notas;
            
            i++;
        }
            
            System.out.println("A média das Notas é: " + soma/4);   
    }
}
