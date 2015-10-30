/**
 * 
 * Escribe un programa que diga si un número introducido por teclado
 * es o no primo. Un número primo es aquel que sólo es divisible entre
 * él mismo y la unidad.
 * 
 * @author Carlos Jurado Moreno 
 */
 public class C05ej22{
   public static void main(String[] args){
     int numero;
     boolean res=false;
     int contador;
     
     System.out.print(2+" ");
     
     for (int i=3; i<101;i++){
       res=false;
       contador=2;
       
         while ((contador>=2)&&(contador<i)&&(!res)){
           if ((i%contador)==0){
            res=true;
           }
           contador++;
         }
         
       if (!res){
            System.out.print(i+" ");
         }
       }
   }
 }
