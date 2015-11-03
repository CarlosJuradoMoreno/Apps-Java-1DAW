/**
 *Números aleatorios
 * 
 *Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el
 *código ascii entre el 32 y el 126. Puedes hacer casting con (char) para convertir un
 *entero en un carácter.
 *
 * @author Carlos Jurado Moreno
 */
public class C06ej12 {
  public static void main(String[] args) {
    boolean i=false;
    while(1=1){
      int car=(int)(Math.random()*95)+32;
      caracter=(char)car;
      System.out.print(caracter);
    }
  }
}
