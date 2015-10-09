/**
 * Bucles
 * 
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia
 * atrás utilizando un bucle do-while
 * 
 * @author Carlos Jurado Moreno
 */
 public class C05ej06{
   public static void main(String[] args){
     int contador=320;
     String resultado="";
     int menosVeinte=-20;
     
     do{
       contador+=menosVeinte;
       resultado= resultado+contador+" ";
     } while(contador>160);
     
     System.out.println(resultado);
   }
 }
