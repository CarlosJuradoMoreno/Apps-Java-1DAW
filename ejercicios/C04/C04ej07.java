//Carlos Jurado Moreno
import java.util.*;
public class C04ej07{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double nota1,nota2,nota3, sol;
    System.out.println("Inserte sus 3 notas separadas por espacios");
    nota1=Double.parseDouble(sc.next());
    nota2=Double.parseDouble(sc.next());
    nota3=Double.parseDouble(sc.next());
    if(nota1<0||nota2<0||nota3<0){
      System.out.println("ERROR: Notas no pueden se negativas");
    }else
    if(nota1>10||nota2>10||nota3>10){
      System.out.println("ERROR: No se puede sacar mas de un 10");
    }else{
      sol= (nota1+nota2+nota3)/3;
      System.out.printf("Su nota media es %.3f", sol);
    }
    
  }
}
