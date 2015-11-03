/**
*Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)
 *separados por espacios.
 *
 * @author Carlos Jurado Moreno
 */
 public class C06ej04{
  public static void main(String[] args){
    int numero;
    for (int i =0;i<20;i++) {
      numero= (int) (Math.random()*11);
      System.out.print(numero+" ");
    }
  
  }
 }
