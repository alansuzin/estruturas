/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;


public class exercicio8 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int idade;
        
        System.out.println("Digite a Idade");
        idade = teclado.nextInt();
        
        if (idade < 12){
            System.out.println("É uma Criança");
        }else if (idade >= 12 && idade <= 18){
            System.out.println("É um Adolecente");
        }else if(idade > 18 && idade < 30){
            System.out.println("É um Jovem");
        }else if(idade >= 30 && idade < 60){
            System.out.println("É um Adulto");
        }else
            System.out.println("É um Idoso");
        
     }    
    }

