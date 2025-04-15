/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;


public class exercicio9 {
        
    public static void main(String[] args) {
      
        Scanner teclado = new Scanner (System.in);    
                
        int valor;
        
        System.out.println("Digite um Valor:");        
        valor = teclado.nextInt();
                
        if (valor >= 350 && valor <= 500){
            System.out.println("O valor se encontra entre o intervalo de 350 e 500");
        }else
            System.out.println("O valor não se encontra entre o intervalo de 350 e 500");
                
            
    }
}
