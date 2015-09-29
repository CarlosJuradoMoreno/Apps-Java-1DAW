//Carlos Jurado Moreno
import java.util.*;

public class C03ej02{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double euros;
	double pesetas;
	double cambio=166.386;

	System.out.println("Introduzca los euros ");
	euros= Integer.parseInt(sc.next());
	
	pesetas= euros*cambio;
	System.out.println("El cambio es "+pesetas+" Pesetas");
	
	}
}
