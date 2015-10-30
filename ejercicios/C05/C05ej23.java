/**
 Escribe un programa que permita ir introduciendo una serie indeterminada
 *de números mientras su suma no supere  el valor 10000. Cuando esto último
  ocurra, se debe mostrar el total acumulado, el contador de los números
 *introducidos y la media.
 * 
 * @author Carlos Jurado Moreno
 */
 public class C05ej23{
  public static void main(String[] args){
  int total=0;
  double numero;
  int contador=1;
  
  System.out.println("Inserte numeros hasta que la suma supere los 10000");
  
  do{
    System.out.print("Inserte el "+contador+" numero: ");
    numero=Integer.parseInt(System.console().readLine());
    total+=numero;
    contador++;
  }while(total<10000);
  
  System.out.println("Total acumulado: "+total+"\nContador de numeros introducidos: "+(contador-1)+"\nMedia: "+(total/contador));
  }
}
