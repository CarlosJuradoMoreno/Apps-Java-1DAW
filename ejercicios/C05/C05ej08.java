/**
 * Bucles
 * 
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author Carlos Jurado Moreno
 */
 public class C05ej08{
   public static void main(String [] args){
     int numero;
     
     System.out.println("Inserte el numero que quiera saber: ");
     numero=Integer.parseInt(System.console().readLine());
     
     for (int i=0; i<=10;i++){
       System.out.println(numero+"*"+i+"= "+numero*i+" ");
     }
   }
 }
