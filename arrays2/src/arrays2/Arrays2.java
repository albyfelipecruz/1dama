/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays2;
import java.util.Scanner;
/**
 *
 * @author alby
 */
public class Arrays2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        llenar();
    }
    
    public static void llenar()
    {
    Scanner read = new Scanner(System.in);
    int[][] array;
    array = new int[2][4];
    int mostrar;
    for (int y=0;y<array.length;y++)
        {
            for (int x=0;x<array[y].length;x++)
                {
                   array[y][x] = read.nextInt();
                }
        }
    
    for (int y=0;y<array.length;y++)
        {
            System.out.println();
            for (int x=0;x<array[y].length;x++)
                {
                   mostrar=array[y][x];
                   
                   System.out.print(+mostrar+"\t");
                   
                }
        } 
    
 
    }
    
 
    
}
