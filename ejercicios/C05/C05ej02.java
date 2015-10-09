/* @author Carlos Jurado Moreno
*
*Muestra los numeros multiplos de 5 del 0 al 100 con bucle while
*
*/
public class C05ej02{
  public static void main (String[] args){
    String multiplos="";
    int contador=0;
    int cinco=5;
    
    while (contador<=100){
      
      if(contador%cinco==0){
        multiplos=multiplos+contador+" ";
      }
      contador++;
    }
    
    System.out.println(multiplos);
  }
}
