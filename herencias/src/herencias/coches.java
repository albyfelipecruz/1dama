/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author alby
 */
public class coches extends vehiculos
{

String nplazas;

public coches(String matricula,String propietario,String marca,String precio,String nplazas)

{
super(matricula,propietario,marca,precio);
this.nplazas=nplazas;
}
}
