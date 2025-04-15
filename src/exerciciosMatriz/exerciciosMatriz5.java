/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosMatriz;


public class exerciciosMatriz5 {
    public static void main(String[] args) {
        
        int [] numeros = {2, 10, 5, 10, 8, 10, 9};
        int contador = 0;
        
        for (int i = 0; i < numeros.length; i++){
        
            if (numeros[i] == 10)
        
                contador++;
        }
        
        System.out.println("Números de elementos iguais a 10: " + contador);
    }
}
