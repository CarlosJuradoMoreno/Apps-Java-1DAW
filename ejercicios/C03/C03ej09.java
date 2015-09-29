//Carlos Jurado Moreno
import java.util.*;
public class C03ej09{
  public static void main(String[] args){
    
    double radio;
    double altura;
    double volumen;
    //Math.pi();
    Scanner sc= new Scanner(System.in);
    System.out.println("Inserte el radio y la altura del cono, separado por un espacio");
    radio=Double.parseDouble(sc.next());
    altura=Double.parseDouble(sc.next());
    
    volumen=((radio*radio)*altura*Math.PI*(1.0/3.0));
   
    System.out.printf("El volumen es %.5f", volumen);
  
  }
}

