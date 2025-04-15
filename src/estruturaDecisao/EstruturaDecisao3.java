/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaDecisao;

import java.util.Scanner;


public class EstruturaDecisao3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String usuario,senha;
        
        System.out.println("Digite seu Usuário");      
        usuario = teclado.nextLine();
        
        System.out.println("Digite sua Senha");
        senha = teclado.nextLine();
        
        //Debug
        System.out.println("Usuário: " + usuario);
        System.out.println("Senha: " + senha);
        
        
        if(usuario.equals("alan")&& senha.equals("12345")){
            System.out.println("Logado com Sucesso");            
        }else{
            System.out.println("Verifique seu Usuário ou Senha");   
        }
    }
    
}
