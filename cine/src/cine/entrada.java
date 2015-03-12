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
public class entrada 
{
    
    double id;
    String categoria;
    int precio;

public entrada(String edad,int precio)
{
    
    id = Math.random()*100;
    this.categoria=edad;
    this.precio=precio;
    

}
///////////////////////setters y getters////////////////////////////////

    public double getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setId(double id) {
        this.id = id;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


}
