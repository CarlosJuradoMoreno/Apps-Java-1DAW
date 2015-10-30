/**
 Realiza un programa que pida un número por teclado y que luego
 *muestre ese número al revés.
 * 
 * @author Carlos Jurado Moreno
 */
 public class C05ej25{
  public static void main(String[] args){
    int numero;
    String reves="";
    
    System.out.println("Inserte un nuemero, y le dare la vuelta");
    numero=Integer.parseInt(System.console().readLine());
    
    while(numero>0){
    reves+= (numero%10);
    numero= (int) numero/10;
    }
    
    System.out.println("El numero es: "+reves);
  }
 }
