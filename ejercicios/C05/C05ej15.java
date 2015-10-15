/**
 *
 * 
 *Escribe un programa que dados dos números, uno real (base) y un
 *entero positivo (exponente), saque por pantalla todas las potencias
 *con base el numero dado y exponentes entre uno y el exponente introducido.
 *No se deben utilizar funciones de exponenciación. Por ejemplo, si
 * introducimos el 2 y el 5, se deberán mostrar 2¹, 2², 2³, 2⁴ y 2⁵.
 *  @author Carlos Jurado Moreno
 */
 import java.util.*;
 public class C05ej15{
   public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      double base=0.0;
      int exponente;
      double resultado=0;
     
     
      System.out.println("Inserte base y esponente separado por expacio (5 2)");
      base=Double.parseDouble(sc.next());
      exponente=Integer.parseInt(sc.next());
      
      if(exponente!=0.0){
        resultado=base;
        
        for (int i =0; i<exponente;i++){
          if(i==0){
            resultado=1;
          }
          else if(i==1){
            resultado=base;
          }else{
            resultado=resultado*base;
          }
          System.out.println(base+"^"+i+"= "+resultado);
         }
      }else{
         System.out.println("ERROR: numero negativo");
      }
  }
 }
