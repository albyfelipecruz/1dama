/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package television;

/**
 *
 * @author acid
 */
public class electronica {
    
private byte estado;
private int canal;
private int volumen;

public electronica() {

estado=0;
canal=0;
volumen=0;

}
/////////METODOS SET/////////

public void encendido()

{
   
   
   if (estado==0) {estado=1;}
   else {estado=0;}
   
   
    
       
}

public void scanal()
{
if (estado==1)
{
    if (canal==99){canal=0;}
    else {canal++;}
}

}

public void bcanal()
{
if (estado==1)    
{
    if (canal<1){canal=canal+99;}
    else {canal--;}
}

}

public void svolumen()
{

if (estado==1)
{    
    if (volumen==99){volumen=0;}
    else {volumen++;}
} 
}

public void bvolumen()
{
if (estado==1)    
{
    if (volumen<1){volumen=volumen+99;}
    else {volumen--;}
}
}

/////////METODOS GET/////////

public int getvol()
{
int vol=volumen;
return vol;
}

public int getcan()
{
int can=canal;
return can;
}

public byte getencendido()
{
byte power=estado;
return power;
}

public String getstringencendido()
{
String stringencendido;
if (estado==0) {stringencendido="OFF";}
else {stringencendido="ON";}
return stringencendido;
}

/////////METODOS ESTETICOS/////////

public String espacios(int esp)
{

String espacio="";
for (int i=1;i<esp;i++)
{espacio="#"+espacio;}

return espacio;  
}
}
