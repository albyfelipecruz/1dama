/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while1;
import java.util.Scanner;
/**
 *
 * @author acid
 */
public class While1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    { 
    
    
    pass();
    
    }
    
    public static void pass()
    {
        int contra;
        
        System.out.println("introdusca su contraseña");
        Scanner read = new Scanner (System.in);
        contra = read.nextInt();
        
        while (contra != 1111)
            
            {
            System.out.println("introdusca otra vez su contraseña");              
            contra = read.nextInt();
            }
            System.out.println("correcto");
    }
    
    }

