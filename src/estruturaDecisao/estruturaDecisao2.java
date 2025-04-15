/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaDecisao;

import java.util.Scanner;


public class estruturaDecisao2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite sua Idade:");
        int idade = teclado.nextInt();
        
        if(idade <= 18){
            System.out.println("Guri"); 
        }else if(idade <= 30){
            System.out.println("Jovem");
        }else if(idade <= 50){
            System.out.println("Meia Idade");
        }else{
            System.out.println("Melhor Idade");
        }
        
    }   
}
