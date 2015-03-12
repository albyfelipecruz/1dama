/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dni;
import java.util.Scanner;
/**
 *
 * @author acid
 */
public class nif 
{

private int dni;
private String letra;
        
public nif()
{
int dni=0;
String letra="";
}
        
public void datos()
    {
      int resto=0;
      String letras[]= 
      {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V",
      "H","L","C","K","E"
      };
        System.out.println("Introdusca su nº de DNI ");     
        Scanner read = new Scanner(System.in);
      
      dni = read.nextInt();
     
      resto = dni%23;
      
      letra = letras[+resto];
      
      System.out.println("dni introducido "+dni);
      System.out.println("letra correspondiente " +letras[+resto]);
     
      
    }
 
public boolean comprobar ()
 
    {
      
      boolean comprobacion;
      int resto=0;
      String Cletra="";
      String letras[]= 
      {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V",
      "H","L","C","K","E"
      };
              
        Scanner read = new Scanner(System.in);
        
      System.out.println("Introdusca su nº de DNI ");
      dni = read.nextInt();
      System.out.println("Introdusca su letra ");
      Cletra = read.next();
      
      resto = dni%23;
      
      letra = letras[+resto];
      
      letra=letra.toLowerCase();
      Cletra=Cletra.toLowerCase();
                
      System.out.println("dni introducido "+dni);
      System.out.println("letra introducido "+Cletra);
      System.out.println("letra correcta "+letras[+resto]);
      
      if (letra.equals(Cletra)) {comprobacion=true;}
      else {comprobacion=false;}
      
      return comprobacion;
      
    }

}