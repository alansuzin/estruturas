
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class estruturaRepeticaoForEx13 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);    
    
        int valor,soma;
    
        soma = 0;
    
        for (int i = 1; i <= 7; i++){
    
            System.out.println("Digite um valor" + i);
            valor = teclado.nextInt();
            
            soma = soma + valor;
        }
    
                System.out.println("A soma dos 7 números é: " + soma);
        
    }
}
