/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdo.pkgwhile;
import java.util.Scanner;
/**
 *
 * @author acid
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int usuario;
        int suma=0;
        
        Scanner read = new Scanner(System.in);
        
        
        
        do
        
        {
            System.out.println("introdusca numero");
            usuario = read.nextInt();
            suma = suma+usuario;
        }
        
        
        while (usuario>0);
        
            {
                System.out.println("Lo acumulado es: ");
                System.out.println(+suma);
            }      
                
                
    }
    
}
