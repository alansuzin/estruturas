/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_java;
    
import java.util.Scanner;


public class Aula_3 {
    public static void main(String[] args) {
        
        Scanner teclado  = new Scanner(System.in);
        
        //Valores Digitados pelo Usuário
        System.out.println("Digitem seu Nome:");
        String nome = teclado.nextLine(); 
        System.out.println("O nome é: " + nome);
        
        //Campo Email
        System.out.println("Digite seu Email");
        String email = teclado.nextLine();
        System.out.println("O Email é:" + email);
        
        //Campo Bairro
        System.out.println("Digite seu Bairro");
        String bairro = teclado.nextLine();
        System.out.println("O Bairro é:" + bairro);
        
        //Campo Rua
        System.out.println("Digite sua Rua");
        String rua = teclado.nextLine();
        System.out.println("A Rua é:" + rua);
        
    }
}
