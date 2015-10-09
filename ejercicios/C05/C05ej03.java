/* @author Carlos Jurado Moreno
*
*Muestra los numeros multiplos de 5 del 0 al 100 con bucle do-while
*
*/
public class C05ej03{
  public static void main (String[] args){
    String multiplos="";
    int contador=0;
    int cinco=5;
    
    do{
      if(contador%cinco==0){
        multiplos=multiplos+contador+" ";
      }
      contador++;
    }while (contador<=100);
    
    System.out.println(multiplos);
  }
}
