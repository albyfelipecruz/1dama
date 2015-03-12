/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurso;

/**
 *
 * @author alby
 */
public class celdas {

String cabezero;
String[][] celdas = new String[3][3];

public celdas()
{
cabezero ="";
celdas=null;
}

public celdas(String cabezero, String[][] datos)

{
this.cabezero = cabezero;
this.celdas = datos;
}

}
