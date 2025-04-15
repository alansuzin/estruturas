/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaRepeticaoWhile;


public class estruturaRepeticaoExercicio4 {
    public static void main(String[] args) {
        
        int paisA = 90000000;
        int paisB = 200000000;
        
        int i = 0;
        
        //Debug
        
        
        while(paisA <= paisB){
            paisA += (paisA/100)*3;
            paisB += (paisB/100)*1.5;
            
                System.out.println("A " + paisA);
                System.out.println("B " + paisB);
            
            i++;   
            
            System.out.println("paisA " + paisA);
            System.out.println("paisB " + paisB);
            System.out.println("Total " + i);
            
        }
        
        
    }
}
