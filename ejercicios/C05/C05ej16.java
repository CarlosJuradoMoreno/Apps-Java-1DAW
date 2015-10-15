/**
 * 
 * Escribe un programa que diga si un número introducido por teclado
 * es o no primo. Un número primo es aquel que sólo es divisible entre
 * él mismo y la unidad.
 * 
 * @author Carlos Jurado Moreno 
 */
 public class C05ej16{
   public static void main(String[] args){
     int numero;
     boolean res=false;
     int contador=3;
     System.out.print("Introduzca un numero entero para averiguar si es primo o no ");
     numero=Integer.parseInt(System.console().readLine());
     
     switch(numero){
       case 0:
       res=false;
       break;
       case 1:
       res=false;
       break;
       case 2:
       res=false;
       break;
      }
      System.out.println(res);
       System.out.println(numero);
       while ((contador>=3)&&(contador<(numero))&&(!res)){
         if ((numero%contador)==0){
           res=true;
         }else{
           res=false;
         }
          System.out.println(contador+"\t"+res);
         contador++;
       }
       
     if (!res){
          System.out.print("El numero es primo");
       }else{
           System.out.print("El numero no es primo");
       }
   }
 }
