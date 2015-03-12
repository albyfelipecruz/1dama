/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package television;
import java.util.Scanner;
/**
 *
 * @author acid
 */
public class mando {

private electronica mitv = new electronica();

Scanner read = new Scanner(System.in);

public void menu()
{
    Scanner read = new Scanner(System.in);
    
int opcion;
System.out.println("MI TELEVISION");
System.out.println(mitv.espacios(20)+" Estado "+mitv.getstringencendido());
System.out.println("1 - Enceder/apagar");
mitv.espacios(50);System.out.println(mitv.espacios(20)+" Canal "+mitv.getcan());
System.out.println("2 - Subir canal");
System.out.println("3 - Bajar canal");
mitv.espacios(50);System.out.println(mitv.espacios(20)+" Volumen "+mitv.getvol());
System.out.println("4 - Subir volumen");
System.out.println("5 - Bajar volumen");
System.out.println(mitv.espacios(20));
System.out.println("6 - Salir");

System.out.println("");

  
  
do
{
    opcion = read.nextInt();
    switch (opcion)
        {
            case 1 :mitv.encendido();
            menu();
                break;
            case 2 :mitv.scanal();
            menu();
                break;
            case 3 :mitv.bcanal();
            menu();
                break;
            case 4 :mitv.svolumen();
            menu();
                break;
            case 5 :mitv.bvolumen();
            menu();
                break;
                      
        }
    
}

  

while (opcion!=6);

}


}

