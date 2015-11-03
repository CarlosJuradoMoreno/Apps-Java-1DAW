/**
 *Escribe un programa que muestre la tirada de tres dados.
 *Se debe mostrar también la suma total (los puntos que suman
 *entre los tres dados).
 * 
 * @author Carlos Jurado Moreno
 */
 public class C06ej01{
  public static void main(String[] args){
    int dado1=(int)(Math.random()*6)+1;
    int dado2=(int)(Math.random()*6)+1;
    int dado3=(int)(Math.random()*6)+1;
    
    System.out.print("Dado 1:"+dado1+"\nDado 2: "+dado2+"\nDado 3: "+dado3);
  
  }
 }
