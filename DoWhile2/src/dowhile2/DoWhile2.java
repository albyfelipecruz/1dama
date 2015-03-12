/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile2;
import java.util.Scanner;
/**
 *
 * @author acid
 */
public class DoWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int usuario;
        int pass;
        
        Scanner read = new Scanner(System.in);
        
        do
        {
            System.out.println("introdusca usuario");
            usuario = read.nextInt();
        
            System.out.println("introdusca contraseña");
            pass = read.nextInt();
        }
        
        
        
        while (usuario == 1234 && pass == 1111);
        {
            System.out.println("datos incorrectos");
        }
        
        
    }
    
}

