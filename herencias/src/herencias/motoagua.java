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
public class motoagua extends motos

{

 String Plazas;
 
 
 public motoagua (String matricula,String propietario,String marca,String precio,String cilindrada,String plazas)
         
 {
 super(matricula,propietario,marca,precio);
 super.cilindrada=cilindrada;

 this.Plazas=plazas;
         
 }
 
 public String tostring()
{

System.out.println("/N");

return "nº de matricula :"+matricula+" el propietario es :" +propietario+"la marca es :"+marca+" el precio es :"+precio+" su cilindrada es de :"+cilindrada+" su nº de plazas es :"+Plazas;

}
 
}
