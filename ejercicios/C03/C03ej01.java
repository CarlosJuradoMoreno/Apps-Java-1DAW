//Carlos Jurado Moreno
import java.util.*;

public class C03ej01{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	int num1;
	int num2;
	int res;
	
	System.out.println("Inserte dos numeros enteros separados por un espadio");
	num1= Integer.parseInt(sc.next());
	num2=Integer.parseInt(sc.next());
	res= num1*num2;
	System.out.println("Resultado de la multiplicacion= "+res);
	}
}
