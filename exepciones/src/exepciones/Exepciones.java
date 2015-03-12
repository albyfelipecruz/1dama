/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;
import java.util.Scanner;
/**
 *
 * @author alby
 */
public class Exepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
        
        mostrar();
        
    }
    
    public static void mostrar()
    { 
        
    int opcion;
    
    do
        {
            opcion = leerNumero("\tPulsa la opcion: ");
            segunOpcion(opcion);
        }       while (opcion !=0);
    }// fin del metodo mostrar
    
    private void mostrarMenu()
    {
        System.out.println("\t\tmanu");
        System.out.println("\t1. Multiplicar");
        System.out.println("\t2. Dividir");
        System.out.println("\t0. Salir");
    }
    private static int leerNumero(String texto)
    {
     int numero;
     Scanner leer = new Scanner (System.in);
     numero = leer.nextInt();
     return numero;
    }// fin del metodo leer numero
    
    private static void segunOpcion(int opcion)
    {
        switch (opcion)
        {
            case 1:
                multiplicar();
                break;
            case 2:;
                dividir();
                break;
            default:
                ;
        }// fin del switch
        
    }//fin del metodo segunOpcion
    
    private static void multiplicar()
    {
    int num1,num2;
    num1=leerNumero("Primer numero: ");
    num2=leerNumero("segundo numero: ");
    System.out.println("El producto es "+(num1*num2));
    }//fin del metodo multiplicar
    
    private static void dividir()
    {
    int num1,num2;
    num1=leerNumero("dividendo");
    num2=leerNumero("divisor");
    System.out.println("El cociente es "+(num1/num2)); 
    }
    
}
