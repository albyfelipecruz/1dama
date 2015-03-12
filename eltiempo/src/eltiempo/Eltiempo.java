/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eltiempo;

/**
 *
 * @author acid
 */
public class Eltiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
    
    temperaturas semana1 = new temperaturas();
    temperaturas semana2 = new temperaturas();
    
    semana1.setdatos();
    System.out.println(semana1.getmensaje());
    
    semana2.setdatos();
    System.out.println(semana2.getmensaje());
    
    semana1.comparador(semana2);
    System.out.println(semana1.comparacion());
  
    }
   
    
    
       
}
