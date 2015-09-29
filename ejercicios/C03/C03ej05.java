//Carlos Jurado Moreno
import java.util.*;
public class C03ej05{
	public static void main (String[] args){
	double area;
	double l1;
	double l2;
	Scanner sc=new Scanner(System.in);
	System.out.print("Inserte lado 1 del rectangulo");
	l1=Double.parseDouble(sc.next());
	System.out.print("Inserte el 2º ladod el rectangulo");
	
	l2=Double.parseDouble(sc.next());
	area=l1*l2;
	System.out.print("El area es: "+area);
	
	}
}
