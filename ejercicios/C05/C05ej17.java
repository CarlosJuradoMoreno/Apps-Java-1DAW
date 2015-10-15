  /** 
   * Realiza un programa que sume los 100 números  siguientes a un número entero y positivo
   * introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es
   * un número positivo).
   * 
   * @author Carlos Jurado Moreno
   */
public class C05ej17{
  public static void main (String [] args){
    int num;
    int res=0;
    do{
      System.out.print("Inserte un numero positivo entero ");
      num=Integer.parseInt(System.console().readLine());
    }while(num<0);
    
    for (int i=0;i<100;i++){
     res+=num+i;
    }
    System.out.println("La suma de los siguientes 100 numeros es: "+res);
  }
}
