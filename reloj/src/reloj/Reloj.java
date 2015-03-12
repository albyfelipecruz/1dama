/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;
import java.util.Scanner;
/**
 *
 * @author acid
 */
public class Reloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int hora = 0;
    int minuto = 0;
    int segundo = 0;
    Scanner read = new Scanner(System.in);
    System.out.println("introduce hora");
    hora = read.nextInt();
    System.out.println("introduce minuto");
    minuto = read.nextInt();
    System.out.println("introduce segundo");
    segundo = read.nextInt();
    segundo = segundo + 30;
    
        if (segundo > 59)
            {
            minuto = minuto+1;
            segundo = segundo - 60;
                if (minuto > 59)
                            {
                                hora = hora+1;
                                minuto = minuto-60;
                            }
                        }
        System.out.println(" hora "+hora+" minuto "+minuto+" segundo "+segundo);
        
            }
        
    
    
    }
    
    
    
