//Carlos Jurado Moreno 
import java.util.*;
public class C03ej10{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int mb;
    int kb;
    int cambio=1024;
    System.out.println("Inserte los Mb");
    mb=Integer.parseInt(sc.next());
    
    kb=mb*1024;
    
    System.out.println(mb+ " Mb son " +kb+ " Kb");
  }
}
