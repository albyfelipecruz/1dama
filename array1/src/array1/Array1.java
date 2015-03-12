/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;
import java.util.Scanner;
/**
 *
 * @author alby
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //mayoramenor();
        //mayorymenor();
        //paresimpares();
        //sidentro();
        //temperaturas();
        sidentro2();
    }
    
private static void mayoramenor()
        
    {
        Scanner leer = new Scanner (System.in);
        int numero[] = new int [10];
        
        
        for (int i=0;i<=9;i++)
        {
            
            System.out.println("introducir numero");
                numero[i] = leer.nextInt();
        
        }; 
        
        for (int i=9;i>0;i--)
        {
            
            System.out.println(+numero[i]);
        }   
        
    }

private static void mayorymenor()
        
    {
        Scanner leer = new Scanner (System.in);
        int numero[] = new int [10];
        int mayor=0;
        int menor=100;
        
        for (int i=0;i<=9;i++)
        {
            
            System.out.println("introducir numero");
                numero[i] = leer.nextInt();
        
        }; 
        
        for (int i=0;i<9;i++)
        {
            
           if (numero[i]>mayor) {mayor=numero[i];}
           if (numero[i]<menor) {menor=numero[i];}
          
                System.out.println(+mayor);
                System.out.println(+menor);
        }
        
    }

private static void paresimpares()
        
    {
        Scanner leer = new Scanner (System.in);
        int numero[] = new int [10];
        int pares=0;
        int impares=0;
        
        for (int i=0;i<=2;i++)
        {
            
            System.out.println("introducir numero");
                numero[i] = leer.nextInt();
        
        }; 
         
        for (int i=0;i<=2;i++)
        {
            
            if (numero[i]%2==0) {pares+=numero[i];}
            else {impares+=numero[i];}    
                    
                    
        }  
                    System.out.println("pares "+pares);
                    System.out.println("impares "+impares);
    }

private static void sidentro()
        
    {
        Scanner leer = new Scanner (System.in);
        int numero[] = new int [10];
        int comprobar=0;
        int contador=0;
        
        for (int i=0;i<=2;i++)
        {
            
            System.out.println("introducir numero");
                numero[i] = leer.nextInt();
        
        }; 
                    
                        comprobar = leer.nextInt();
                        
        for (int i=0;i<=2;i++)
        {
                    if (numero[i]==comprobar) {contador++;}
        };
         
            if (contador>0) {System.out.println("El numero se encuantra dentro "+contador+" veces");}
            if (contador==0) {System.out.println("El numero no se encuantra dentro ");}
    }

private static void temperaturas()
        
    {
        Scanner leer = new Scanner (System.in);
        int numero[] = new int [10];
        int mayor=-5;
        int menor=45;
        int suma=0;
        for (int i=0;i<=6;i++)
        {
            
            switch (i)
                
                    {
    
                case 0: System.out.println("Introducir temperatura del lunes");
                    break;
                case 1: System.out.println("Introducir temperatura del martes");
                    break;    
                case 2: System.out.println("Introducir temperatura del miercoles");
                    break;
                case 3: System.out.println("Introducir temperatura del juebes");
                    break;
                case 4: System.out.println("Introducir temperatura del viernes");
                    break;
                case 5: System.out.println("Introducir temperatura del sabado");
                    break;
                case 6: System.out.println("Introducir temperatura del domingo");
                    break;   
                    
        }
                numero[i] = leer.nextInt();
                suma+=numero[i];
        }; 
        
        for (int i=0;i<6;i++)
        {
            
           if (numero[i]>mayor) {mayor=numero[i];}
           if (numero[i]<menor) {menor=numero[i];}
           
                         
           
        }
        
        System.out.println("mayor temperatura");
        System.out.println(+mayor);
        System.out.println("menor temperatura");
        System.out.println(+menor);
        System.out.println("Temperatura media");
        System.out.println(+suma/7);
        
        
    }

private static void sidentro2()
        
    {
        Scanner leer = new Scanner (System.in);
        int numero[] = new int [10];
        int num=0;
        int contador=0;
        
        for (int i=0;i<=3;i++)
        {
            
            System.out.println("introducir numero");
            
                numero[i] = leer.nextInt();
                
                num=numero[i];
                
                     //for (i=0;i<=3;i++)
                       // {
                         //           if (numero[i]==num) {System.out.println("repetida");}
                        //};
        
        }; 
                    
                 
         
            
    }

          
    }
    
