/**
 * Bucles
 * 
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 * 
 * @author Carlos Jurado Moreno
 */
 public class C05ej09{
   public static void main(String[] args){
     double numero=0;
     int digitos=0;
     
     System.out.print("Inserte un numero: ");
     numero=Double.parseDouble(System.console().readLine());
    
     numero=Math.abs(numero);
     
     while(numero%10!=0){
     if (numero!=0) {
       numero =numero*10;
       } 
     }
     
     numero=numero/10;
     while(numero>0){
       numero= (int) numero/10;
       digitos++;
     }
     
     
     System.out.println("Su numero tiene "+digitos+" digitos");
   }
 }
