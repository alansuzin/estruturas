/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaRepeticaoWhile;

import java.util.Scanner;


public class estruturaRepeticaoWhile4 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int i = 0;
        int fim;
        
        System.out.println("Digite um Valor Entre 0 e 20");
        fim = teclado.nextInt();                
        
        while(i <= fim){
        
            System.out.println("Quantidade da Repetição");
            
            i++;
        }
        
    }
}
