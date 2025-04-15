/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaDecisao;

import java.util.Scanner;

public class AulaCondicional {
    public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in); 
        
       float n1 , n2 , media;
       
        System.out.println("Digite a Primeira Nota");
        n1 = teclado.nextFloat();
        
        System.out.println("Digite a Segunda Nota");
        n2 = teclado.nextFloat();
        
        media = (n1+n2)/2;
        
        //Decisão
        
        if(media >= 7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
    }
    
        
        
        
        
        
    
    }
}
