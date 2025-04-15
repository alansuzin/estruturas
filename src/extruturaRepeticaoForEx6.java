
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class extruturaRepeticaoForEx6 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int valor,maior;
        
            System.out.println("Digite um valor");
        
        valor = teclado.nextInt();
        
        maior = valor;
        
        for (int i = 2; i <= 5; i++){
        
            System.out.println("Digite um valor");
            valor = teclado.nextInt();
            
            if (valor > maior)
                maior = valor;
        }
        
            System.out.println("O maior valor é " + maior);
            
        
        
        
        
    }
}
