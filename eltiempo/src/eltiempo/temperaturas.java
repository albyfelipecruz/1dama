/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eltiempo;
import java.util.Scanner;
/**
 *
 * @author acid
 */
public class temperaturas 

{
private int dia;
private int semana;
private int tmax;
private int tmin;
private int tavg;
//variable usada para obetener el valor de comparar las temperaturas*//
private int cavg;
//*******************************************************************//

public temperaturas()

{
dia=0;
semana=0;
tmax=-100;
tmin=100;
tavg=0;
tavg=0;
}

public void setdatos()

{
    int temperatura=0;
    int avg=0;
   
    Scanner read = new Scanner(System.in);
        
            System.out.println("Introducir semana");
        
           semana = read.nextInt();
           
         for (int i=1;i<8;i++)
        
         {
             //uso el contador para identificar los dias
             dia=i; 
             //*****************************************
             
             menu();
             
                temperatura = read.nextInt();
                if (temperatura < -10 || temperatura > 40) {System.out.println("datos incorrectos vuelva a intentarlo");i--;continue;}
                     
                    
                 avg=(avg+temperatura);
                 
                 if (temperatura>tmax) {tmax=temperatura;}
                 if (temperatura<tmin) {tmin=temperatura;}
                     
                              
         }  
            
            tavg=avg/7;
                     
            
}

//Obtengo el mensaje// 
public String getmensaje()
{

    String mensaje="El numero de la semana es "+semana+" La temperatura maxima es de "+tmax+" La temperatura minima a sido de "+tmin+ " y La temperatura media de "+tavg;

return mensaje;
}

private void menu()

{

switch (dia)
        {
    
    case 1: System.out.println("Introducir temperatura del lunes");
    break;
    case 2: System.out.println("Introducir temperatura del martes");
    break;    
    case 3: System.out.println("Introducir temperatura del miercoles");
    break;
    case 4: System.out.println("Introducir temperatura del juebes");
    break;
    case 5: System.out.println("Introducir temperatura del viernes");
    break;
    case 6: System.out.println("Introducir temperatura del sabado");
    break;
    case 7: System.out.println("Introducir temperatura del domingo");
    break;   
        }

        
}

private int getmedia()
{
int avg=tavg;
return avg;
}

public void comparador(temperaturas semana2)

{


if (this.getmedia()>semana2.getmedia()) {cavg=1;}
else if (this.getmedia()<semana2.getmedia()) {cavg=-1;}
else if (this.getmedia()==semana2.getmedia()) {cavg=0;}

comparacion(); 

}

public String comparacion()
{

String mensaje; 
        
if (cavg == 1) {mensaje = "La temperatura media de la primera semana es mayor a la semana segunda";}    
else if (cavg == 0) {mensaje = "La temperatura media de la primera semana es igual a la de la segunda semana ";}
else {mensaje= "la segunda semana ha tenido una mayor media de temperatura";}

return mensaje;
}


}