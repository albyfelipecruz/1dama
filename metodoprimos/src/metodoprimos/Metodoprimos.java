/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoprimos;

/**
 *
 * @author acid
 */
public class Metodoprimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
    comprobacion(47,5);
    //System.out.println(primos(5));
    }
    
    
    public static boolean primos(int numero) 
    {
    
    int divisor = 2;
    
      
    while (numero > divisor)
    
    {
        
        if (numero%divisor==0) {return false;}
        divisor++;
    }
    
    return true;
    
    }
    
    public static void comprobacion(int numero1, int numero2) 
          
    {
    
      
    while (numero1>numero2)
    
    {
    
   
        if (primos(numero1)==true) 
        {
            System.out.println(+numero1);
        
        };
        
    numero1--;
   
    
    }
    
    
    }    
}
