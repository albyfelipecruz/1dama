/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;
import java.io.*;
/**
 *
 * @author alby
 */
public class libreta 
{


persona persona1;
persona persona2;
persona persona3;
String[] array;


public libreta()
{

persona1 = new persona("fulano","123");
persona2 = new persona("mengano","456");
persona3 = new persona("pepe","789");

}

public void escribir determinate serializable()
{
try
{
  
 FileOutputStream agenda = new FileOutputStream("/home/alby/agenda.txt");
 ObjectOutputStream ag = new ObjectOutputStream(agenda);
 ag.writeObject(persona1);
 ag.writeObject(persona2);
 ag.writeObject(persona3);
 
 }
catch (Exception e) {System.out.println("error");}
}




}
