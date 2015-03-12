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
public class menu {

        Scanner read = new Scanner(System.in);
        private nif minif = new nif();
    
public void menutexto()

{
    int opcion=0;
    
    do
        
    {
        opcion = read.nextInt();
        System.out.println("1- Buscar letra NIF");
        System.out.println("2- Comrobar letra NIF");
        System.out.println("3- Salir");
        
        opciones(opcion);
        
    }
    
   while (opcion!=3);
   
    
}

public void opciones(int opcion)
{
    switch (opcion)
{
          case 1 : minif.datos(); ;
              break;
          case 2 : minif.comprobar() ;
              break;
          
}

    
}
}