/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile5;

import java.util.Scanner;

/**
 *
 * @author acid
 */
public class DoWhile5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
    
    int numero1;
    int numero2;
    
    Scanner read = new Scanner (System.in);
    
    numero1 = read.nextInt();
    numero2 = read.nextInt();
    
    recorrido(numero1,numero2);
      
    }
    
    public static void recorrido(int num1, int num2) 
    
    {
        
    do
    
    {num1++;
    System.out.println(+num1); 
    }
    while (num1 < num2);
    
    
      
    }
    
    public static void captura()
    {
    
    
    
    }
}
