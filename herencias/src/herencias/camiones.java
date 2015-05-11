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
public class camiones extends vehiculos
{

String cargamax;

public camiones(String matricula,String propietario,String marca,String precio,String cargamax)
{
super(matricula,propietario,marca,precio);
this.cargamax=cargamax;
}

@Override public String tostring()
{

System.out.println("/N");

return "nº de matricula :"+matricula+ " el propietario es :"+propietario+" la marca es :"+marca+" el precio es :"+precio+" su carga maxima es :"+cargamax;

}

}

