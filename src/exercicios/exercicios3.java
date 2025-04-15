/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;


public class exercicios3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        float n1 , n2 , n3 , media;
        
        System.out.println("Informe a nota 1");
        n1 = teclado.nextFloat();
        
        System.out.println("Informe a nota 2");
        n2 = teclado.nextFloat();
        
        System.out.println("Informe a nota 3");
        n3 = teclado.nextFloat();
        
        media =(n1+n2+n3)/3;
        
        if(media>=7)
            System.out.println("Aprovado");
        else if(media>=5)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");
        
            
    }
}
