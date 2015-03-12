/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoahorcado;

import java.util.Arrays;

/**
 *
 * @author alby
 */
public class Ahorcado 

{
private String palabra;
private String[] letrasok;
private int fallos=0;
private int sitioslibres;


public Ahorcado()
        {
                palabra="elefante";
                letrasok= new String[palabra.length()];
                sitioslibres =palabra.length();
                rellenar();
        }

public  Ahorcado(String palabra)
        {
                this.palabra=palabra;
                letrasok= new String[palabra.length()];
                sitioslibres =palabra.length();
                rellenar();
                
        }

public boolean recibeletra(char letra)
{
 
                String l;
                boolean errores=false;
                int contador=0;
                for (int i=0;i<palabra.length();i++)
                {
                     if (palabra.charAt(i) == letra) 
                     
                     {
                         l = String.valueOf(letra);
                         letrasok[i]=l;
                         contador++;
                         errores=false;
                     }               
                } 
                
                if (contador==0) {fallos++;contador=0;errores=true;}
                comprobarfin();
                return errores;
                
              
                                    
                
 }

private void rellenar()

{

for (int i=0;i<letrasok.length;i++)

letrasok[i]="*";
    
}

public void estado()
{
    for (int i=0;i<palabra.length();i++)
        
                {
                    System.out.print(letrasok[i]);
                }

System.out.println("");

}     

public boolean comprobarfin()
    
    {
         boolean fin=false;
         int contador=0;
         for (int i=0;i<palabra.length();i++)
                {
                      
                     
                     
                 if (letrasok[i]!="*") {contador++;}
                 if (contador==letrasok.length) {fin=true;}
                 }
            
         return fin;
    }
                  
                    
}


        
