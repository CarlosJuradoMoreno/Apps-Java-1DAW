/**
 *Escribe un programa que muestre por pantalla  todos  los números enteros positivos menores
 *a uno leído por teclado que no sean divisibles entre otro también leído de igual forma.
 * 
 * @author Carlos Jurado Moreno
 */
 public class C05ej29{
  public static void main(String[] args){
    int numMayor;
    int divisor;
    
    System.out.print("Inserte el numero mayor: ");
    numMayor=Integer.parseInt(System.console().readLine());
    System.out.print("Inserte el divisor: ");
    divisor=Integer.parseInt(System.console().readLine());
    
    for (int i=1;i<numMayor;i++){
      if((i%divisor)==0){
      
      }else{
      System.out.println(i);
      }
    }
  
  }
 }
