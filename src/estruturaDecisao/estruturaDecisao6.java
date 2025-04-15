/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaDecisao;

import java.util.Scanner;


public class estruturaDecisao6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int opcao;
        boolean sair = true;       
        
            System.out.println("Digite 1 para Cadastros de Cliente \n Digite 2 para Cadastros de Fornecedor \n Digite 3 para Cadastros de Produto \n Digite 4 para cadastros de Usuário \n Digite 5 para sair");
            opcao = teclado.nextInt();
            
            
        switch(opcao){
            
            case 1 :
                System.out.println("Cadastros de Clientes");
            break;
                
            case 2 :
                System.out.println("Cadastros de Fornecedor");
            break;
            
            case 3 :
                System.out.println("Cadastros de Produtos");
            break;
            
            case 4 :
                System.out.println("Cadastros de Usuários");
            break;  
            
            case 5 :
                sair = false;
                //Debug
                System.out.println(sair);
                System.out.println("Saiu do Sistema");
            break;
                
            default:
                System.out.println("Menu não encontrado");
            
        }
        
    }
}
