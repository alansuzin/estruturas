
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class estruturaRepeticaoForEx9 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int valor,menor;
        
            System.out.println("Digite um valor");
            
        valor = teclado.nextInt();
        menor = valor;
        
        for (int i = 2; i <= 8; i++){
        
            System.out.println("Digite um valor");
            valor = teclado.nextInt();
                 
            if(valor < menor)
                menor = valor;
        }
        
            System.out.println("O menor valor é " + menor);
    }
}
