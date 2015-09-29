//Carlos Jurado Moreno
import java.util.*;
public class C03ej06 {
  public static void main (String[] args){
    Scanner sc= new Scanner(System.in);
    int base;
    int altura;
    double area;
    
    System.out.println("Inserte la base y la altura del triangulo, en ese orden y separado por un espacio");
    base=Integer.parseInt(sc.next());
    altura= Integer.parseInt(sc.next());
    
    area= (double) (base*altura)/2;
    
    System.out.printf("El area del triangulo cuya base es "+base+" y altura es "+altura+ " es %.3f", area);
  }
}
