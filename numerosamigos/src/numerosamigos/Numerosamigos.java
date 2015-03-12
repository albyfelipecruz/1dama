/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosamigos;

/**
 *
 * @author acid
 */
public class Numerosamigos {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        comprobacion(998104,1043096);
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
            
            public static void comprobacion(int num1, int num2)
            {
                
                    if (num2==suma(num1)) {System.out.println("amigos");}
                    else {System.out.println("no amigos");}
                    
                    num1++;
                
                
                
                
            }
    
}
