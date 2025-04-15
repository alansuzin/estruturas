
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class estruturaRepeticaoForEx2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
       
        int menor,valor,i;       
        
            System.out.println("Informe um valor");
            
        valor = teclado.nextInt();
        menor = valor;        
                
        for (i = 1; i <= 2; i++){
        
            System.out.println("Informe o valor");
            valor = teclado.nextInt();
            
            if(valor<menor)
                menor=valor;
        }
        
            System.out.println("O valor menor é " + menor);
        
    }
}
