/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaRepeticaoFor;

import java.util.Scanner;


public class estruturaRepeticaoFor3 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        float notas;
        float soma = 0;
        
        
        
        for (int i = 1; i <= 3; i++){
        
            System.out.println("Digite a Nota" + i);
            notas = teclado.nextFloat();
            
            soma += notas;
        }
        
        System.out.println("A média é " + soma/3);
        
        
        
        
        
        
    }
}
