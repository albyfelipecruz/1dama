/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while4;
import java.util.Scanner;
/**
 *
 * @author acid
 */
public class While4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
    ndigitos(2500);
            
            
    }
    public static int ndigitos(int numero)
    {
         
      int contador = 1;
     
      System.out.println("introdusca el numero");
      
      
            while (numero > 9)
               {
                numero=numero/10;
                contador++;
               }
        
       System.out.println("el numero tiene "+contador+" digitos");
       return contador;
       
    }
}