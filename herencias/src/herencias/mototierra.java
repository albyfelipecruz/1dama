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
public class mototierra extends motos
{
    
String tipo;

public mototierra (String matricula,String propietario,String marca,String precio,String tipo,String cilindrada)

{
super(matricula,propietario,marca,precio);
super.cilindrada=cilindrada;
this.tipo=tipo;
}

 public String tostring()
{

System.out.println("/N");

return "nº de matricula :"+matricula+" el propietario es :"+propietario+" la marca es :"+marca+" el precio es :"+precio+" su cilindrada es de :"+cilindrada+" tipo de moto :"+tipo;

}

}
