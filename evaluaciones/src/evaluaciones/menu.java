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
public class menu {
    

boletin miboletin = new boletin();  


public void inicio()
{
Scanner read = new Scanner(System.in);


int opcion=0;
        
        do
        {
            System.out.println("1 - Iniciar boletin");
            System.out.println("2 - Insertar notas almuno");
            System.out.println("3 - Insertar notas asignatura");
            System.out.println("4 - Insertar nota");
            System.out.println("5 - mostrar notas");
            System.out.println("0 - Salir");
            
                opcion = read.nextInt();
                
                switch (opcion)
                        
                        {
                            case 1 : miboletin.rellenar(); ;
                                break;
                            case 2 : miboletin.insertarNAL(alumnos()); ;
                                break;
                            case 3 : miboletin.insertarNAS(asignatura()); ;
                                break;
                            case 4 : miboletin.insertar(alumnos(),asignatura()); ;
                                break;
                            case 5 : miboletin.mostrar(); ;
                                break;
                            
                                
                        }
                
        }
        
        while (opcion!=0);
         
   
    



}

public int alumnos()

{
    
int opcion;

Scanner read = new Scanner(System.in);
 
System.out.println("Seleccione alumno"); 

            System.out.println("0 - Alumno A");
            System.out.println("1 - Alumno B");
            System.out.println("2 - Alumno C");
            System.out.println("3 - Alumno D");   
            System.out.println("4 - Alumno E"); 
            
                opcion = read.nextInt();
                
              
return opcion;                
        
        
}

public int asignatura()

{

int opcion;

Scanner read = new Scanner(System.in);
 
System.out.println("Seleccione asignatura");
 
            System.out.println("0 - Matematicas");
            System.out.println("1 - Lengua");
            System.out.println("2 - Informatica");
 
            
                opcion = read.nextInt();
                
              
return opcion;                
        
        
}






    


}

