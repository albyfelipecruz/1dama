/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluaciones;
import java.util.*;
/**
 *
 * @author alby
 */
public class alumnos {
    
String alumnos[];

//constructor vacio

public alumnos()

    {
        alumnos = null;   
    }

//constructor elementos del array

public alumnos(String[] entrada)        
    {
        alumnos = entrada;
    }
//constructor logitud array
public alumnos(int largo)
        
    {
        alumnos = new String[largo];
    }
public void lista()
{
    
           for (int i=0;i<alumnos.length;i++)
            {
                System.out.println(alumnos[i]);
            }  
}
//buscar posicion en nombre del array

public int buscar(String nombre)

    {
        
    int posicion=0;    
    
        for (int i=0;i<alumnos.length;i++)
            {
                if (nombre==alumnos[i])
                    posicion = i;
                    
            }   
    
    return posicion;
    
    }

//buscar cadena correspondiente a posicion

public String buscarcadena(int posicion)
    
    {
        
     String nombre="";    
     
     nombre=alumnos[posicion];
    
     return nombre;
    }

public int cantidad()
    {
        
    int cantidad;
    
    cantidad = alumnos.length;

    return cantidad;
    }


}
