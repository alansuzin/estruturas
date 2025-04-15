/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;


public class exercicio11 {
        public static void main(String[] args) {
        
            Scanner teclado = new Scanner (System.in);
            
            int numero;
            
            System.out.println("Digite um número");
            
            numero = teclado.nextInt();
            
            if (numero % 8 == 0){
                System.out.println("O número é divisível por 8");
            }else
                System.out.println("O número não é divisível por 8");
    }
}
