/**
 *Bucles
 * 
 * Realiza el control de acceso a una caja fuerte. La combinación
 * será un número de 4 cifras. El programa nos pedirá la combinación
 * para abrirla. Si no acertamos, se nos mostrará el mensaje
 * “Lo siento, esa no es la combinación” y si acertamos se nos dirá
 * “La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro
 * oportunidades para abrir la caja fuerte.
 * 
 * @author Carlos Jurado Moreno
 */
 import java.util.*;
public class C05ej07{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int codigo=1234;
    boolean flag=false;
    
    do{
      System.out.print("Inserte codigo: ");
      
      if(Integer.parseInt(sc.next())==codigo){
        System.out.println("La caja se ha abierto satisfactoriamente");
        flag=true;
      }else{
        System.out.println("Lo siento esa no es la combinacion");
      }
      
    }while(!flag);
  }
}
