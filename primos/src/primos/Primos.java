/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primos;

/**
 *
 * @author acid
 */
public class Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num1=7;
        float num2=1;
        int contador=1;
        
        while (num1>num2)
                {
                    if (num1%num2 == 0)
                    {
                    num2++;
                    contador++;                 
                    }
                    else
                    num2++;
                    
                }
                
               
                    
                if (contador==2 && contador==1) 
                    {
                    System.out.println(num1);
                    System.out.println(+contador);
                    }
                
    }
                
    }
    

