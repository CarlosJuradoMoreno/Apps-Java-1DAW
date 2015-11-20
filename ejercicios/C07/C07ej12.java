/**Realiza un programa que pida 10 números por teclado y que los almacene en un array. A
continuación se mostrará el contenido de ese array junto al índice (0 – 9). Seguidamente el
programa pedirá dos posiciones a las que llamaremos inicial y final. Se debe comprobar
que inicial es menor que final y que ambos números están entre 0 y 9. El programa deberá
colocar el número de la posición inicial en la posición final, rotando el resto de números
para que no se pierda ninguno. Al final se debe mostrar el array resultante.
* @author Carlos Jurado Moreno
**/
import java.util.*;
public class C07ej12{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros=new int[10];
		int inicio;
		int fin;
		int contador=0;
		int numSiguiente=0;
		int numActual=0;
		int numInicio;
		int numFin;

				do{
			System.out.print("Inserte posicion inicial y final (4 9)");
			inicio=Integer.parseInt(sc.next());
			fin=Integer.parseInt(sc.next());
		}while ((inicio>9||fin>9)||(inicio<0||fin<0)||inicio>fin);

		do{
			System.out.print("Inserte el "+(contador+1)+" numero: ");
			numeros[contador]=Integer.parseInt(System.console().readLine());
			contador++;
		}while(contador<10);

		numInicio=numeros[inicio];
		numFin=numeros[fin];

		for(int i=0;i<=inicio;i++){
			if(i==0){
				numSiguiente=numeros[i];
				numeros[i]=numeros[numeros.length-1];
			}else{
				numActual=numeros[i];
				numeros[i]=numSiguiente;
				numSiguiente=numActual;
			}
		}

		for (int i=fin;i<numeros.length;i++){
			if(i==fin){
				numSiguiente=numeros[i];
				numeros[i]=numInicio;
			}else{
				numActual=numeros[i];
				numeros[i]=numSiguiente;
				numSiguiente=numActual;
			}

		}

		for(int imprimir:numeros){
			System.out.print(imprimir+" ");
		}
		sc.close();
	}
}