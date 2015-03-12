/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile4;

/**
 *
 * @author acid
 */
public class DoWhile4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        multiplos3();
    }
    
    public static void multiplos3()
    {
      float num1 = 1;
      float num2 = 50;
      float divisor = 3;
      float contador = 1;
      
      do
           {
         
         
                    
                        if (num1%divisor == 0)
                            {
                             contador++;                 
                             }
               
                        if (contador == 2) {System.out.println(num1);}
                        
                        
                contador = 1;
                num1++;
                
            }
               
      while (num1 < num2);
      
    }
    
}
