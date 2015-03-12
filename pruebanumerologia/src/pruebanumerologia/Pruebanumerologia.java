/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebanumerologia;

/**
 *
 * @author acid
 */
public class Pruebanumerologia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //sumas(22,02,1982);
        descomponer(3434);
        
    }

    
public static void sumas(int dia,int mes,int anio)

{
// aprobecho la propiedad de los datos tipo int que redondean a la baja
// cuando reciben un float.
//*****************************************************************************

int numero;

//*****************************************************************************
// Descompongo los numeros de la fecha en digitos
//*****************************************************************************

//DIAS
//int dias=descomponer(dia);
//MESES
//int meses=descomponer(mes);
//ANIOS
//int anios=descomponer(anio);

}


public static void descomponer(int num)

    {
        
        int restos=0;
        int suma=0;
        while (num>9)
        {
         restos=num%10;
         num=num/10;
         suma=suma+restos;
        }
     //Hay que sumarle num al resultado del bucle porque el ultimo numero no entra en el\\
         suma = suma+num;
         System.out.println(+suma);   
    }


}


//public static void descomponer(int num)

  //  {
        
    
         
    //    if (num>9)
      //      {
        //     num=(num%10)+((num/10)%10)+((num/100)%10)+((num/1000)%10);
            
          //  } 
            
            
        
        
        //System.out.println(+num);
    //}