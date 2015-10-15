/**
 * Escribe un programa que muestre los n primeros términos de la
 * serie de Fibonacci. El primer término de la serie de Fibonacci
 * es 0, el segundo es 1 y el resto se calcula sumando los dos
 * anteriores, por lo que tendríamos que los términos son 0, 1, 1,
 * 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe
 *introducir por teclado.
 * 
 * @author Carlos Jurado Moreno
 */
 public class C05ej12{
   public static void main(String[] args){
     int n;
     int resultado=0;
     int num1=0;
     int num2=1;
     int aux=0;
     System.out.println("Inserte el valor de la sucesion de fibonacci que le interesa saber");
     n=Integer.parseInt(System.console().readLine());
     if(n>=0){
      if(n==1){
        resultado=1;
      }else{
        for(int i=2;i<n;i++){
          aux=num1+num2;
          num1=num2;
          num2=aux;
          resultado=num2+num1;
        }
        System.out.println("El valor de Fibonacci "+n+" es: "+resultado);
      }
     }else{
        System.out.println("Error, numero negativo");
     }
   }
 }
