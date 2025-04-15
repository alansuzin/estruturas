/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;


public class exercicios4 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        float salarioBase , salarioLiquido , bonus;
        
        int idade;
        
        System.out.println("Digite o Valor do Salário Base");
        salarioBase = teclado.nextFloat();
        
        System.out.println("Digite a Idade do Funcionário");
        idade = teclado.nextInt();
        
        bonus = 0;
        
        if (salarioBase >= 1000 && idade > 50)
            bonus = (float)(salarioBase*0.10);
            
        else if(salarioBase < 1000 && idade<=50)
            bonus = (float)(salarioBase*0.05);
        
        salarioLiquido = salarioBase + bonus;
            System.out.println("O salário base: é " + salarioBase);
            System.out.println("O salário líquido é: " + salarioLiquido);
            System.out.println("O bônus é: " + bonus);
 
    }
}
