/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosgemelos;

/**
 *
 * @author acid
 */
public class Numerosgemelos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
    
      // System.out.println(primo1(8));
    gemelos(5,7);
    
    }
    
    
     public static int primo1(int num)
            
    {
      
      
      float divisor = 1;
      float contador = 1;
      int primo=0;
            
      while (num > divisor)
                {
                    
                    if (num%divisor == 0)
                    {
                    divisor++;
                    contador++;                 
                    }
                    else
                    {divisor++;}
                    
                    
                }
                
                if (contador == 2 || contador == 1) {primo=num;}
                contador = 1;
                divisor = 1;
                
      return primo;          
                                 
    }
     
    public static int primo2(int num)
            
    {
      
      
      float divisor = 1;
      float contador = 1;
      int primo=0;
            
      while (num > divisor)
                {
                    
                    if (num%divisor == 0)
                    {
                    divisor++;
                    contador++;                 
                    }
                    else
                    {divisor++;}
                    
                    
                }
                
                if (contador == 2 || contador == 1) {primo=num;}
                contador = 1;
                divisor = 1;
                
      return primo;          
                                 
    }
     
    public static void gemelos(int numero1,int numero2)
            
    {
    
        if (primo2(numero2)-primo1(numero1)==2) {System.out.println("gemelos");}
        else {System.out.println("no gemelos");}
    }
            
}
     
       

