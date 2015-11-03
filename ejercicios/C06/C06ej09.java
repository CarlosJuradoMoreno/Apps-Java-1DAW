/**
 *Realiza un programa que vaya generando números aleatorios pares
 *entre 0 y 100 y que no termine hasta que no saque el número 24. El
 *programa deberá decir al final cuántos números se han generado.
 *
 * @author Carlos Jurado moreno
 */
 public class C06ej09{
  public static void main(String[] args){
    int numero=0;
    int contador=0;
    while(numero!=24){
      numero=(int)(Math.random()*101);
        if(numero%2==0){
          contador++;
        }
    }
    System.out.print(contador);
  }
 }
