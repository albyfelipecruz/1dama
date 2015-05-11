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
public class vehiculos 

{
    String matricula;
    String propietario;
    String marca;
    String precio;
    
public vehiculos(String matricula,String propietario,String marca,String precio)

{
this.matricula=matricula;
this.propietario=propietario;
this.marca=marca;
this.precio=precio;
}

public String tostring()
{

System.out.println("/N");

return "nº de matricula :"+matricula+"el propietario es :"+propietario+"la marca es :"+marca+"el precio es :"+precio;

}

}

