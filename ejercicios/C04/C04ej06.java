//Carlos Jurado Moreo
import java.util.*;
public class C04ej06{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    double g=9.81;
    double altura=0.0;
    double tiempo;
    System.out.println("Inserte la altura desde la que quiere lanzar el objto");
    altura= Double.parseDouble(sc.next());
    tiempo=Math.sqrt((2.0*altura)/g);
    
    System.out.println("El tiempo que tarda en caer es "+tiempo+" s");
    
  }
  
}
