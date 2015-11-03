/**
 *Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
 *adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido, el
 *programa dirá cuántas oportunidades quedan y si el número introducido es menor o 
 *mayor que el que ha pensado.
 *
 * @author Carlos Jurado Moreno
 */
 
public class C06ej06{
  public static void main(String[] args){
    int numero=(int) (Math.random()*101);
    int fallos=0;
    boolean acertado=false;
    
    do{
      System.out.println("Inserte el numero: ");
        int entrada=Integer.parseInt(System.console().readLine());
        if(numero==entrada){
          acertado=true;
          System.out.println("Has acertado");
        }
      fallos++;
      System.out.println("Has fallado, tienes "+fallos+" fallos");
      if(entrada>numero){
        System.out.println("EL numero es menor el tuyo");
      }else{
        System.out.println("El numero es mayor que el tuyo");
      }
  }while((fallos<5)&&(!acertado));
    if(!acertado){
      System.out.println("EL numero era "+numero);
    }
  }
}
