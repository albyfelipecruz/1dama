/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayoriaedad;
import java.util.Scanner;
/**
 *
 * @author acid
 */
public class Mayoriaedad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        
        int ano;
        int mes;
        int dia;
                     
        int anon;
        int mesn;
        int dian;
        
        System.out.println("año elecciones");
        ano = read.nextInt();
        
        System.out.println("mes elecciones");
        mes = read.nextInt();
        
        System.out.println("dia elecciones");
        dia = read.nextInt();
        
        
        System.out.println("año nacimiento");
        anon = read.nextInt();
        
        System.out.println("mes de nacimiento");
        mesn = read.nextInt();
        
        System.out.println("dia de nacimiento");
        dian = read.nextInt();
       
            
        int edad= (ano-anon);
        
                if (mesn >= mes && edad == 18 && dian >= dia)
            
                    {
                        System.out.println("mayor de edad");
                    }
        
                else
            
                    {
                        System.out.println("no puede votar");
                    }
       
        
    }
    
}
