/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaRepeticaoWhile;

import java.util.Scanner;


public class estruturaRepeticaoExercicio7 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int valor,soma;
        
        soma = 0;
        
        for(int aux = 1; aux <= 7; aux++){
            
            System.out.println("Digite o valor " + aux);
            
            valor = teclado.nextInt();
            
            soma = soma + valor;
        }
        
        System.out.println("A soma dos sete valores digitados é " + soma);
         
    }
}
