/**
 * Escribe un programa que calcule la media de un conjunto de números
 * positivos introducidos por teclado. A priori, el programa no sabe
 * cuántos números se introducirán. El usuario indicará que ha terminado
 * de introducir los datos cuando meta un número negativo.
 * 
 * @author Carlos Jurado Moreno
 */
 import java.util.*;
 public class C05ej10{
   public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     double numero;
     double acumulador=0;
     int contador=0;
     
      System.out.println("Inserte numeros por teclado para calcular la media, si quieres terminar, inserta un numero negativo");
     
     do{
       System.out.print("Inserte un numero: ");
       numero=Double.parseDouble(sc.next());
       if(numero>=0){
         acumulador+=numero;
        contador++;
      }
     }while(numero>=0);
     
     System.out.println("La media es: "+acumulador/contador);
   }
 }
