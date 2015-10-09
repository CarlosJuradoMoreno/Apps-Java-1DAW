/**
 * Bucles
 * 
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia
 * atrás utilizando un bucle while.
 * 
 * @author Carlos Jurado Moreno
 */
 public class C05ej05{
   public static void main(String[] args){
     int contador=320;
     String resultado="";
     int menosVeinte=-20;
     
     while(contador>160){
       contador+=menosVeinte;
       resultado= resultado+contador+" ";
     }
     
     System.out.println(resultado);
   }
 }
