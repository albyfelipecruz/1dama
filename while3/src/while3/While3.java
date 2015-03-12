/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while3;

/**
 *
 * @author acid
 */
public class While3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {

        //siguiente codigo compreba si un numero es primo
        System.out.println("¿ el numero es primo ? "+primos(9));
     
        //siguente codigo ejectua un rango de primos
        rangoprimos();
    
      
    }
    
    public static void rangoprimos()
    {
      float num1 = 47;
      float num2 = 5;
      float divisor = 1;
      float contador = 1;
      
              
      while (num1 > num2)
      {
         while (num1 > divisor)
                {
                    
                    if (num1%divisor == 0)
                    {
                    divisor++;
                    contador++;                 
                    }
                    else
                    {divisor++;}
                    
                    
                }
                
                //System.out.println(+contador);
                if (contador == 2 || contador == 1) {System.out.println(num1);}
                contador = 1;
                divisor=1;
                num1--;
      
      
      
      }
    }
    
    public static boolean primos(int num1)
            
    {
      
      
      float divisor = 1;
      float contador = 1;
      boolean primo;
      
      while (num1 > divisor)
                {
                    
                    if (num1%divisor == 0)
                    {
                    divisor++;
                    contador++;                 
                    }
                    else
                    {divisor++;}
                    
                    
                }
                
                if (contador == 2 || contador == 1) {primo=true;} else {primo=false;}
                contador = 1;
                divisor = 1;
                return primo;
                  
    
    }
    
    }
    

