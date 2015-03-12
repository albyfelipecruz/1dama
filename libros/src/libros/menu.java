/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;
import java.util.*;

/**
 *
 * @author alby
 */
public class menu {
    
private libro libro1 = new libro("primero","a",50);
private libro libro2 = new libro("segundo","b",60);
private libro libro3 = new libro("tercero","c",70);
private libro libro4 = new libro("cuarto","d",50);
private libro libro5 = new libro("quinto","e",70);
private libro libro6 = new libro("sexto","a",40);
private libro libro7 = new libro("septimo","b",60);
private libro libro8 = new libro("octavo","c",60);
private libro libro9 = new libro("noveno","d",70);
private libro libro10 = new libro("decimo","c",50);
private libro libro11 = new libro("decimoprimero","d",30);
private libro libro12 = new libro("decimosegundo","e",50);
private libro libro13 = new libro("decimotercero","a",40);
private libro libro14 = new libro("decimocaurto","c",35);
private libro libro15 = new libro("decimoquinto","d",45);

Stack <libro> mipila = new Stack();
//Stack  mipila = new Stack();

public void añadirlibro()
{

mipila.push(libro1);
mipila.push(libro2);
mipila.push(libro3);
mipila.push(libro4);
mipila.push(libro5);
mipila.push(libro6);
mipila.push(libro7);
mipila.push(libro8);
mipila.push(libro9);
mipila.push(libro10);
mipila.push(libro11);
mipila.push(libro12);
mipila.push(libro13);
mipila.push(libro14);
mipila.push(libro15);


}

public void mostrarultimo()
{
    //libro paso; 
    //paso = (libro) mipila.peek();
    //paso =  mipila.peek();
     
System.out.println("Este es el ultimo elemento de le pila "+mipila.peek().getLibro());
}

public void extraerlibro()
{
mipila.pop();
System.out.println("Libro extraido, estado del final de la pila :"+mipila.peek().getLibro());
}

public void tamañopila()
{
System.out.println(mipila.size());
}

public void valortotal()
{


}

}
