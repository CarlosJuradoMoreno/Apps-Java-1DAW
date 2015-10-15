/** 
 * 11. Escribe un programa que muestre en tres columnas, el cuadrado y
 *     el cubo de los 5 primeros números enteros a partir de uno que se
 *     introduce por teclado.
 * 
 * @author Carlos Jurado Moreno
 */
 public class C05ej11{
   public static void main(String[] args){
     int numero;
     int cuadrado;
     int cubo;
     
     System.out.println("Inserte un numero entero");
     numero=Integer.parseInt(System.console().readLine());
     
    for(int i=0;i<5;i++){
      cuadrado= (int) Math.pow(numero,2);
      cubo= (int) Math.pow(numero,3);
      System.out.println(numero+"\t"+cuadrado+"\t"+cubo);
      numero++;
    }
   }
 }
