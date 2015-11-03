/**
 *Escribe  un  programa que calcule el factorial de un  número
 *entero leído por teclado.
 * 
 * @author Carlos Jurado Moreno
 */
 public class C05ej28{
  public static void main(String[] args){
    int factorial;
    int resultado=1;
    
    System.out.print("Inserte el numero ");
    factorial=Integer.parseInt(System.console().readLine());
    
    while(factorial>0){
      resultado=resultado*factorial;
      factorial--;
    }
    System.out.println(resultado);
  }
 }
