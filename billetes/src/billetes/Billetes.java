/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billetes;
import java.util.Scanner;
/**
 *
 * @author acid
 */
public class Billetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int dinero;
    int b200;
    int b100;
    int b50;
    int b10;
    //int b20;
    Scanner read = new Scanner(System.in);
    System.out.println("Introdusca el dinero");
    dinero = read.nextInt();
    
    b200=dinero/200;
    b100=(dinero-(b200*200))/100;
    b50=((dinero-(b200*200))%100)/50;
    b10=(((dinero-(b200*200))%100)%50)/10;
    
    System.out.println(b200+" billetes de 200 "+b100+" billetes de 100 "+b50+" billetes de 50 "+b10+" billetes de 10 ");
    
    }
    
}
