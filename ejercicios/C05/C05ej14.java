/**
 * 
 * Escribe un programa que pida una base y un exponente (entero positivo)
 * y que calcule la potencia.
 * 
 * @author Carlos Jurado moreno
 */
 import java.util.*;
 public class C05ej14{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     double base;
     double exponente;
     double resultado=0;
     
    System.out.println("Inserte base y esponente separado por expacio (5 2)");
    base=Double.parseDouble(sc.next());
    exponente=Double.parseDouble(sc.next());
    if(exponente!=0.0){
      if (exponente>=0){
        resultado=base;
        for (int i =0; i<exponente;i++){
          
          if(i==0){
            resultado=base*base;
          }else{
            resultado= resultado*base;
          }
        }
        System.out.println(resultado);
      }else{
         System.out.println("ERROR: numero negativo");
      }
       }else{
       System.out.println("1");
     }
       
   }
 }
