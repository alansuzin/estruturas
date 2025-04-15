/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoWhile;

import java.util.Scanner;


public class estruturaDoWhile1 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        int numero;
        
        do{
        
            System.out.println("Digite um número  positivo");
            numero = teclado.nextInt();
            
        }while(numero >= 0);

            System.out.println("Digite um número válido" + numero);




    }
}
