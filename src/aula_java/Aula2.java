/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_java;

import java.text.DecimalFormat;


public class Aula2 {
    
    public static void main(String[] args) {
        
        DecimalFormat casas = new DecimalFormat("#.###");
        
        float n1 = (float) 7.698;
        float n2 = (float) 8.658;
        float resposta = (n1/n2);
        
        System.out.println(casas.format(resposta));
        System.out.println("Comando de saída");
    }
    
}
