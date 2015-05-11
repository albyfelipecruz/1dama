/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;
import java.util.*;
/**
 *
 * @author alby
 */
public class menu 

{
ArrayList<vehiculos> vehiculos = new ArrayList();


public void opciones()

{
Scanner read = new Scanner(System.in);
int opcion = 0;

    do

    {
        
        
        
        System.out.println("1 - Dar de alta vehiculo en categoria");
        System.out.println("2 - Mostrar todos los vehiculos");
        System.out.println("3 - Mostrar motos");
        System.out.println("4 - Mostrar por matricula");
        System.out.println("5 - Salir");
        
        opcion = read.nextInt();
    
        switch (opcion)  

        {
                case 1 : agregar();
                    break;
                case 2 : 
                    break;
                case 3 : 
                    break;
                case 4 : 
                    break;
        }
    }

    while (opcion!=6);





}

public void agregar()
{

Scanner read = new Scanner(System.in);

int opcion = 0;

    do

    {
        
               
        System.out.println("1 - Agregar coche");
        System.out.println("2 - Agregar camiones");
        System.out.println("3 - Agregar motos");
        System.out.println("4 - Volver");
                      
        opcion = read.nextInt();
        
        switch (opcion)  

        {
                case 1 : coches();
                    break;
                case 2 : camion();
                    break;
         }
    }

    while (opcion!=4);
    
    
}

public void agregarmoto()
{

Scanner read = new Scanner(System.in);

int opcion = 0;

    do

    {
        
               
        System.out.println("1 - Agregar moto de agua");
        System.out.println("2 - Agregar moto de tierra");
        System.out.println("3 - Volver");
        
                      
        opcion = read.nextInt();
        
        switch (opcion)  

        {
                case 1 : motoagua();
                    break;
                case 2 : motodetierra();
                    break;
         }
    }

    while (opcion!=4);
    
    
}

public void coches ()
{
String matricula;
String propietario;
String marca;
String precio;
String nplazas;
coches micoche;

Scanner read = new Scanner(System.in);

    System.out.println("matricula");
        matricula = read.next();

    System.out.println("propietario");
        propietario = read.next();

    System.out.println("marca");
        marca = read.next();

    System.out.println("precio");
        precio = read.next();

    System.out.println("nplazas");
        nplazas = read.next();
        
   vehiculos.add(micoche = new coches(matricula,propietario,marca,precio,nplazas)); 


}

public void camion ()
{
String matricula;
String propietario;
String marca;
String precio;
String cargamax;
camiones micamion;

Scanner read = new Scanner(System.in);

System.out.println("matricula");
        matricula = read.next();

    System.out.println("propietario");
        propietario = read.next();

    System.out.println("marca");
        marca = read.next();

    System.out.println("precio");
        precio = read.next();
    
    System.out.println("cargamaxima");
        cargamax = read.next();
        
        vehiculos.add(micamion = new camiones(matricula,propietario,marca,precio,cargamax));
}

public void motoagua()
{
String matricula;
String propietario;
String marca;
String cilindrada;
String precio;   
String Plazas;

Scanner read = new Scanner(System.in);

System.out.println("matricula");
        matricula = read.next();

    System.out.println("propietario");
        propietario = read.next();

    System.out.println("marca");
        marca = read.next();

    System.out.println("precio");
        precio = read.next();
}

public void motodetierra()
{
String matricula;
String propietario;
String marca;
String cilindrada;
String precio;
String tipo;

Scanner read = new Scanner(System.in);

System.out.println("matricula");
        matricula = read.next();

    System.out.println("propietario");
        propietario = read.next();

    System.out.println("marca");
        marca = read.next();

    System.out.println("precio");
        precio = read.next();
}

}



