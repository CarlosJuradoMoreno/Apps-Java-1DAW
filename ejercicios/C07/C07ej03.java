/** @author Carlos Jurado Moreno
*	Escribe un programa que lea 10 números por teclado y que luego los muestre en orden
*	inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.
**/
public class C07ej03{
	public static void main(String[] args) {
		int numero;
		int[] inversoNumeros= new int[10];
		int numeros=1;
		int contadorBucle=9;

		do{
			System.out.print("Inserte el "+numeros+" numero ");
			numero=Integer.parseInt(System.console().readLine());
			inversoNumeros[contadorBucle]=numero;
			contadorBucle--;
			numeros++;
		}while (numeros<=10);
		for (int i:inversoNumeros){
			System.out.println(i);
		}
	}
}