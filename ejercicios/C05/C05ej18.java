/**
 * 
 * Escribe un programa que obtenga los números enteros comprendidos entre dos números
 * introducidos por teclado y validados como distintos, el programa debe empezar por
 * el menor de los enteros introducidos e ir incrementando de 7 en 7.
 * 
 * @author Carlos Jurado moreno
 */
 
 public class C05ej18{
 
   public static void main(String [] args){
     int num1;
     int num2;
     String res;
    
     do{
       System.out.print("Inserte el primer numero: ");
       num1=Integer.parseInt(System.console().readLine());
       System.out.print("Inserte el segundo numero: ");
       num2=Integer.parseInt(System.console().readLine());
     }while(num1<0||num2<0);
     
     if(num1>num2){
       int aux;
       aux=num1;
       num1=num2;
       num2=aux;
     }
     
     for(int i=num1;i<=num2;i+=7){
       if(i<num2){
         System.out.print(i+" ");
       }
     }
     
   }
 }
