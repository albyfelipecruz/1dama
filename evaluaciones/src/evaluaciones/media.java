/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluaciones;

/**
 *
 * @author alby
 */
public class media 

{
    
float [] media = new float[5];


public media(int[][] notas)
        
    {
        
     float avg = 0;
     
     
     for (int y=0;y<notas.length;y++)
     { 
         for (int x=0;x<notas[y].length;x++)
                {
                    avg+=notas[y][x];
                }
         
         avg=avg/3;
         media[y]=avg;   
         avg=0;
            
         }
    
}

public void mostrarmedia()
{
        float mostrar;
            for (int y=0;y<media.length;y++)
            {
                System.out.println();
                
                    
                       mostrar=media[y];
                   
                       System.out.print(mostrar+"\t");
                   
                    

            }    


}

}
