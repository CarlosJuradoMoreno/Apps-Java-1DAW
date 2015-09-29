//Carlos Jurado Moreno
import java.util.*;

public class C03ej03{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double euros=0.0;
	double pesetas=0.0;
	double cambio=166.386;

	System.out.println("Introduzca las Pesetas ");
	pesetas= Integer.parseInt(sc.next());
	euros= pesetas/cambio;
	
	System.out.printf("El cambio es %.2f €",euros);
	
	
	}
}
