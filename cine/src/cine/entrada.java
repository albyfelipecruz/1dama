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
    boolean menores;
    int precio;

public entrada()
{
    
    id = Math.random()*100;
    boolean menores=false;
    int precio=0;       

}

    public void setMenores(boolean menores) {
        this.menores = menores;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }



}
