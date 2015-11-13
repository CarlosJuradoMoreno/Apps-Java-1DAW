/**
 *Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
 *adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido, el
 *programa dirá cuántas oportunidades quedan y si el número introducido es menor o 
 *mayor que el que ha pensado.
 *
 * @author Carlos Jurado Moreno
 */
public class C06ej14{
  public static void main(String[] args){
    int intentos=0;
    boolean acertado=false;
    int numero=(int)(Math.random()*101);
    String caso="";
    int superior=100;
    int inferior=0;
   
    do{
    System.out.println("Su numero mayor, menor o igual a : "+numero);
    caso=System.console().readLine();
    
    switch(caso){
    case "mayor":
    inferior=numero+1;
    numero=(int)(Math.random()*(superior-inferior)+inferior);
    intentos++;
    break;
    case "menor":
    superior=numero;
    numero=(int)(Math.random()*(superior-inferior)+inferior);
    
    intentos++;
    break;
    case "igual":
    acertado=true;
    System.out.println("Lo conseguí!");
    break;
    default:
    System.out.println("Inserte dato correcto");
  }
    }while(!acertado&&intentos<5);
  }
}
