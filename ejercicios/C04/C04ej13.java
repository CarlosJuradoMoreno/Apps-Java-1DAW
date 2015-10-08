//Carlos Jurado Moreno
import java.util.*;
public class C04ej13{
  public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
    double num1=0;
    double num2=0;
    double num3=0;
    String salida="";
    System.out.println ("Inserte 3 numeros separados por espacios ej (1 2 3)");
    num1=Integer.parseInt(sc.next());
    num2=Integer.parseInt(sc.next());
    num3=Integer.parseInt(sc.next());
    if((num1>num2)&&(num1>num3)){
      salida+=num1+" ";
      if(num2>num3){
        salida+=num2+" ";
        salida+=num3+" ";
      }else{
        salida+=num3+" ";
        salida+=num2+" ";
      }
    }
    if((num2>num3)&&(num2>num1)){
      salida+=num2+" ";
      if(num1>num3){
        salida+=num1+" ";
        salida+=num3+" ";
      }else{
        salida+=num3+" ";
        salida+=num1+" ";
      }
    }
    if((num3>num1)&&(num3>num2)){
      salida +=num3+" ";
      if(num1>num2){
        salida+=num1+" ";
        salida+=num2+" ";
      }
      else{
        salida +=num2+" ";
        salida+=num1+" ";
      }
    }
    System.out.println(salida);
  }
}
