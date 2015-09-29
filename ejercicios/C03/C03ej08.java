//carlos Jurado Moreno
import java.util.*;

public class C03ej08{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int horas;                            //Solamente contaran las horas enteras
  int EURHORA=12;
  int salario;
  System.out.println("Inserte las horas trabajadas esta semana");
  horas=Integer.parseInt(sc.next());
  salario= horas*12;
  System.out.println("Su salario asciende a "+salario+"€");
  
  }
}
