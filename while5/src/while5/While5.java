/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while5;
import java.util.*;
/**
 *
 * @author acid
 */
public class While5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
    
    juego();
    
    
    
    }
    
    public static void juego()
    
    {
        int usuario;
        int sistema = 6;
        int num1=1;
        int num2=10;
        int contador=1;
        
        Scanner read = new Scanner(System.in);
        
        
            while (num1<num2 && contador<4)
        {
                 
                
                  
                
                  System.out.println("introduce el numero");
                  System.out.println("");
                  usuario = read.nextInt();
                    
                    if (usuario != sistema)
                    {
                      System.out.print("incorrecto");
                      System.out.println("");
                      contador++;
                      if (usuario<sistema)
                      {
                          System.out.print("un poquito mas");
                          System.out.println("");
                      }
                      else {
                          
                          System.out.print("un poquito menos");
                          System.out.println("");
                      }
                    }
                    
                    else 
                    
                    {System.out.print("correcto");
                    System.out.println("");
                    }        
              
         }
            
  System.out.println("");          
  System.out.println("game over");  
  System.out.println("");
  
    }
}