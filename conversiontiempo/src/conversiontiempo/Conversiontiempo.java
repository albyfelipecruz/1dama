/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiontiempo;
import java.util.Scanner;
/**
 *
 * @author acid
 */
public class Conversiontiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int horas;
    int minutos;
    int segundos;
    int tiempo;
    
    
    Scanner read = new Scanner(System.in);
    
    System.out.println("introdusca los segundos ");
    tiempo = read.nextInt();
    
    
   minutos = tiempo / 60;
   segundos = tiempo % 60;
   horas = minutos / 60;
   minutos = minutos % 60;
   
                           
    System.out.println(horas+" horas "+minutos+ " minutos "+segundos+ " segundos ");
    
    
    }
    
}
