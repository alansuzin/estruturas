/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;


public class exercicio7 {
        public static void main(String[] args) {
      
        Scanner teclado = new Scanner (System.in);   
            
        float n1 , n2 , n3 , n4 , media;
        
            System.out.println("Digite a nota 1");
            n1 = teclado.nextFloat();
            
            System.out.println("Digite a nota 2");
            n2 = teclado.nextFloat();
            
            System.out.println("Digite a nota 3");
            n3 = teclado.nextFloat();
            
            System.out.println("Digite a nota 4");
            n4 = teclado.nextFloat();
            
            media = (n1 + n2 + n3 + n4) /4;
            
            System.out.println(" A média do Aluno foi " + media);
            
            if (media > 7){
                System.out.println("O Aluno foi Aprovado");
            
            }else{
                System.out.println("O Aluno foi Reprovado");
           
            }
                
            
    }
}
