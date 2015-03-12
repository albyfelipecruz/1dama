/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoahorcado;
import java.util.Scanner;
/**
 *
 * @author alby
 */
public class juego 

  {
  String letra;
  int fallospermitidos;
  private Ahorcado miahorcado = new Ahorcado("abc");

public juego()
{
fallospermitidos=0;
}


public void inicio()
        
  {
  
while (fallospermitidos<5)
    
        {      
            Scanner read = new Scanner(System.in);
  
            char l;
            boolean errores;
            boolean fin;
  
            System.out.println("Introducir Letra");
            letra = read.next();
  
            l=letra.charAt(0);
 
  miahorcado.recibeletra(l);
  miahorcado.estado();

            errores = miahorcado.recibeletra(l);


            if (errores==true) {fallospermitidos++;}
            System.out.println(" fallos cometidos "+fallospermitidos);

            fin=miahorcado.comprobarfin();

            if (fin==true) {fallospermitidos=5;System.out.println("");System.out.println("FIN DE LA PARTIDA");}

} 
  
  }

public void fin()

    {
    fallospermitidos=5;
    }

  }