/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;
import java.util.*;
/**
 *
 * @author alby
 */
public class taquilla 
{

Queue <entrada> colacine = new LinkedList();



public void comprar()
{

String pasocategoria;
int preciopaso;
int edad;

for (int i=0;i<5;i++)
{
    Scanner read = new Scanner(System.in);
    System.out.println("introducir edad");
    edad = read.nextInt();
    
    if (edad > 18) {preciopaso = 500;pasocategoria = "adultos";} 
    else {preciopaso=300;pasocategoria = "niños";}
    
    entrada mientrada = new entrada(pasocategoria,preciopaso);
                colacine.offer(mientrada);
}


}

public void mostrarcola()

{
//for (int i=0;i<5;i++)
//{
System.out.println(colacine.peek().getPrecio());
System.out.println(colacine.peek().getCategoria());
        
//}    
}

}