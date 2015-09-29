//Carlos Jurado Moreno
import java.util.*;
public class C03ej04{
	public static void main(String[] args){
	Scanner sc= new Scanner (System.in);
	double x;
	double y;
	double mult;
	double res;
	double sum;
	double div;
	
	System.out.println("Inserte el valor X");
	x=Double.parseDouble(sc.next());
	System.out.println("Inserte el valor Y");
	y=Double.parseDouble(sc.next());
	
	sum= x+y;
	res=x-y;
	mult=x*y;
	div=x/y;
	
	System.out.println("Resultados: ");
	System.out.println("Suma "+sum+"\nResta "+res+"\nMultiplicacion "+mult);
	
	System.out.printf("Division  %.2f", div);
	}
}
