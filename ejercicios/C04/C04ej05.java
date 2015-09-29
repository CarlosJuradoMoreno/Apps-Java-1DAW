//Carlos Jurado Moreno
import java.util.*;
public class C04ej05{
  public static void main(String[] args){
    Scanner sc= new Scanner (System.in);
    double a=0.0;
    double b=0.0;
    double inversor=0.0;
    double resultado=0.0;
    System.out.println("Vamos a resolveruna ecuacion de forma Ax+B=0");
    System.out.println("Variable A=");
    a=Double.parseDouble(sc.next());
    System.out.println("Variable B=");
    b=Double.parseDouble(sc.next());
    inversor-=b;
    resultado= inversor/a;
    
    System.out.println("X= "+resultado);
  }
}
