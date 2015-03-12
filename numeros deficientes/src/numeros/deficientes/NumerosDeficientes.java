/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros.deficientes;

/**
 *
 * @author acid
 */
public class NumerosDeficientes {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        recorrido(1,1000);
        //suma(8);
    }
    
    
    
    
            public static int suma(int num)
            {
    
            int suma;
            int divisor;
            suma=0;
            divisor=1;
        
                while (num>divisor)
                    {
                        if (num % divisor==0) {suma=suma+divisor;}
                        divisor++;
                    }
                divisor=0;
        
                //System.out.println(+suma);
                return suma;
             }
            
            public static void recorrido(int num1, int num2)
            {
                while (num1<num2)
                {
                    if (num1>suma(num1)) {System.out.println(+num1);}
                    num1++;
                }
                
                
            }
    
}
