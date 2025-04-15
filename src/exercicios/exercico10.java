/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;


public class exercico10 {
        public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);    
            
        float n1,n2,n3,media;       
            System.out.println("Digite a sua Nota");
        
        n1 = teclado.nextFloat();
            System.out.println("Digite a Nota 1");
        
        n2 = teclado.nextFloat();
            System.out.println("Digite a Nota 2");
            
        n3 = teclado.nextFloat();
            System.out.println("Digite a Nota 3");
                       
        media = (n1+n2+n3);
        
            System.out.println("A média do aluno foi igual a " + media);
        
        if (media >= 5){
            System.out.println("O Aluno foi Aprovado");
        }else
                System.out.println("O Aluno foi Reprovado");     
          
    }
}
