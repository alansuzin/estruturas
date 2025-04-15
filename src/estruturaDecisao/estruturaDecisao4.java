/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaDecisao;

import java.util.Scanner;


public class estruturaDecisao4 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
      
        double salario;
        
        System.out.println("Digite seu Salário");
        salario = teclado.nextDouble();
        
        if(salario <= 1000){
            System.out.println("5%: " + (1000*5)/100);
        }else if(salario <= 1500){
            System.out.println("7%: " + (1500*7)/100);
        }else if(salario <= 2500){
            System.out.println("9%: " + (2500*9)/100);
        }else if(salario <= 4000){
            System.out.println("15%: " + (4000*15)/100);
        }else{
            System.out.println("18%: " + (4000*18)/100); 
            
        }
            
        }
        
        
        
        
        
    }    

