/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;


public class exercicio5 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        float altura,pesoIdeal;
        
        int sexo;
        
        System.out.println("Digite a sua Altura");
            altura = teclado.nextFloat();
        
      
            
        System.out.println("Informe o sexo 1(F) ou 2(M)");
        
        sexo = teclado.nextInt();
        
        if (sexo == 1){
            pesoIdeal = (float)((62.1*altura)-44.7);
        }else{
            pesoIdeal = (float)((72.7*altura)-58);
        }
        
        System.out.println("O peso ideal é: " + pesoIdeal);
        
        
        
        
    }
}
