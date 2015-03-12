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
public class boletin {

int[][] notas;
String[] paso = new String[]{"a","c","d","e","f"};
alumnos misalumnos = new alumnos(paso);


public boletin()
    {
        notas = new int[5][3];
    }

   


public void rellenar()
    {
    
        for (int y=0;y<notas.length;y++)

    
            for (int x=0;x<notas[y].length;x++)
                
            {
                notas[y][x]=5;
            }
    }

public void insertarNAL(int alumno)
{
                Scanner read = new Scanner(System.in);

            for (int x=0;x<notas[alumno].length;x++)
                
            {
                notas[alumno][x]=read.nextInt();
            }
            
}

public void insertarNAS(int asignatura)
{
                Scanner read = new Scanner(System.in);

            for (int y=0;y<notas.length;y++)
                
            {
                notas[y][asignatura]=read.nextInt();
            }
    
}

public void insertar(int alumno, int asignatura)
{
                Scanner read = new Scanner(System.in);
                int nota;
               
                             
               System.out.print("introdusca nota");
               
               nota=read.nextInt();
               
               notas[alumno][asignatura]=nota;
           
    
}

////////////////////////////////
//PARTE DE CODIGO PARA PRUEBAS//
////////////////////////////////

public void datos()
{

System.out.print("matematica");
System.out.print(" ");
System.out.print("lengua");
System.out.print(" ");
System.out.print("informatica");




        int mostrar;
            for (int y=0;y<notas.length;y++)
            {
                
                System.out.println();
                for (int x=0;x<notas[y].length;x++)
                    {
                       mostrar=notas[y][x];
                       
                   System.out.print("     ");
                   
                       System.out.print(mostrar+"\t");
                   
                    }

            }    

 



}

public void mostrar()
{
 
 media mimedia = new media(notas);
 datos();
 mimedia.mostrarmedia();                
 misalumnos.lista();  
}



    
   
    

}


 


