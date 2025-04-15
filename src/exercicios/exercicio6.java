/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;


public class exercicio6 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        float totalVendas , salario;
        
        System.out.println("Digite o total de Vendas");
        
        totalVendas = teclado.nextFloat();
        
        if (totalVendas > 2000)
            salario = (float)(totalVendas*10+50);
        
        else
            salario = (float)(totalVendas*0.075);
        
        System.out.println("O Salário é: " + salario);
              
    }
}
