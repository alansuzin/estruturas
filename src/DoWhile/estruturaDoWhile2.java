/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoWhile;

import java.util.Scanner;

public class estruturaDoWhile2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int opcao;
        boolean continuar = true;
        String empresa,endereco,nome,marca,modelo;
        float preco;
        double numero,tamanho;
         
        
        
        
        
        do{
                System.out.println("Digite: 1,2,3 ou 4 para Sair");
                opcao = teclado.nextInt();
                
            switch(opcao){
                
                case 1:
                    empresa = teclado.nextLine();
                    System.out.println("Cadastro Empresa");
                    empresa = teclado.nextLine();
                    System.out.println("O nome da empresa é: " + empresa);
                    
                    System.out.println("Cadastro do Endereço");
                    endereco = teclado.nextLine();
                    
                    System.out.println("O nome da Empresa é: " + empresa + "Endereço" + endereco);                    
                    
                    System.out.println("Preço");
                    preco = teclado.nextFloat();
                    System.out.println("O preço é: " + preco);
                    
                    System.out.println("Número");
                    numero = teclado.nextInt();
                    System.out.println("O número é: " + numero);
                    
                break;
                
                case 2:         
                    nome = teclado.nextLine();
                    System.out.println("Cadastre o Cliente");
                    nome = teclado.nextLine();
                    System.out.println("O nome é: " + nome);
                    
                    System.out.println("Cadastre seu CPF");
                    numero = teclado.nextInt();
                    System.out.println("O CPF é: " + numero);
                    
                    System.out.println("O nome é: " + nome + "CPF" + numero); 
                    
                break;
                
                case 3:
                    nome = teclado.nextLine();
                    System.out.println("Cadastro produto");
                    modelo = teclado.nextLine();
                    System.out.println("Modelo é: " + modelo);
                    
                    System.out.println("Qual a Marca");
                    marca = teclado.nextLine();
                    System.out.println("Marca: " + marca);
                    
                    System.out.println("Qual o seu tamanho");
                    tamanho = teclado.nextInt();
                    System.out.println("tamanho: " + tamanho);
                    
                break;
                
                case 4:
                    continuar = false;
                break;
                
                default:
                    System.out.println("Número Inválido");
            }
            
        }while(continuar);
        
        
        
        
        
        
        
    }
}
