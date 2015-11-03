/**
 *Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 *separados por espacios. Muestra el máximo, el mínimo y la media de esos números.
 *
 * @author Carlos Jurado Moreno
 */
 public class C06ej05{
  public static void main(String[] args){
    int numero;
    int maximo=0;
    int minimo=199;
    double media=0;
    
    for (int i=0;i<50;i++){
      numero=(int)(Math.random()*100)+100;
      if(numero>maximo){
        maximo=numero;
      }
      if(numero<minimo){
        minimo=numero;
      }
      media=(numero+media)/2;
      System.out.print(numero+" ");
    }
    System.out.println("\nEl maximo es "+maximo+" el minimo es "+minimo);
    System.out.printf("La media es %.2f",media);
  }
 }
