/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosuerte;

/**
 *
 * @author acid
 */
public class numerologia 

{
private int dia;
private int mes;
private int anio;


public numerologia(int dia, int mes, int anio)

{
dia=0;
mes=0;
anio=0;
}

public numerologia()

{
dia=0;
mes=0;
anio=0;
}



public static int sumas(int dia,int mes,int anio)

{

int sumafechas;
int sumafinal;

//DIAS
dia=descomponer(dia);
//MESES
mes=descomponer(mes);
//ANIOS
anio=descomponer(anio);
//SUMA de la descomposicion de las fechas
sumafechas=dia+mes+anio;
//SUMA FINAL
sumafinal=descomponer(sumafechas);

return sumafinal;
}


public static int descomponer(int num)

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
         return suma;  
    }

}
