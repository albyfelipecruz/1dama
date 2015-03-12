/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while2;

import java.util.Scanner;

/**
 *
 * @author acid
 */
public class While2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
    
   rango();
        
    }
    
    public static void rango()
    {
    int num1;
    int num2;
        
    Scanner read = new Scanner (System.in);
    
        System.out.println("introdusca el primer numero");
        num1 = read.nextInt();
    
        System.out.println("introdusca el segundo numero");
        num2 = read.nextInt();
        
        num2 = num2-1;
        
            while (num1 < num2 )
        
            {
                num1++;
                    System.out.println(+num1);
                    
            }  
        
            
            
    }
    
}
