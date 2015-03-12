/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

/**
 *
 * @author alby
 */
public class libro {
    
String libro;
String editorial;
float precio;

public libro(String libro,String editorial,int precio)
{
this.libro=libro;
this.editorial=editorial;
this.precio=precio;  
}

    public libro() {
    }



public String getLibro() {
        return libro;
    }

    public String getEditorial() {
        return editorial;
    }

    public float getPrecio() {
        return precio;
    }


        



}
