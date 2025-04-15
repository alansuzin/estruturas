
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class estruturaRepeticaoForEx15 {
    public static void main(String[] args) {
     
        Scanner teclado = new Scanner (System.in); 
                
        int valor;
            
            System.out.println("Digite um valor");
            
        valor = teclado.nextInt();
        
        for (int i = 1; i <= valor; i++){
        
            System.out.println(i);        
        
        }   
    }
}
