/**
 * 
 *Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y
 *nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares.
 *El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no
 *se incluye en el cómputo.
 * 
 * @author Carlos Jurado Moreno
 */
 
 public class C05ej21{
   public static void main(String[] args){
     double numero;
     double media=-1;
     double pares=0;
     int contador=1;
     
     System.out.println("Inserte numeros, cuando quiera acabar, inserte un numero negativo");
    
     do{
        System.out.print("Inserte "+contador+"º numero: ");
       numero=Double.parseDouble(System.console().readLine());
       if(numero>=0){
         if(numero%2==0){
           if(numero>pares){
             pares=numero;
           }
         }else{
           if(media==-1){
             media=numero;
           }else{
             media=(media+numero)/2;
           }
         }
         
       }
       contador++;
     }while (numero>=0);
     if(media==-1){
       media=0;
     }
     System.out.print("La media de los impares es "+media+". El mayor de los pares es "+pares);
   }
 }
