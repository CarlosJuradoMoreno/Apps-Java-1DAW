/**Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre
*por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores
*y a continuación cambiará todas las ocurrencias del primer valor por el segundo en
*la lista generada anteriormente. Los números que se han cambiado deben aparecer
*entrecomillados.
*@author Carlos Jurado Moreno
**/
import java.util.*;
public class C07ej07{

	public static void main(String[] args){
		String[] numeros= new String[10];
		Scanner sc= new Scanner(System.in);
		int nuevo;
		int viejo;


		for (int i =0;i<numeros.length;i++){							//construimos
			
			numeros[i]=Integer.toString((int)(Math.random()*21))	;
		}

		for(String imprimir:numeros){										//imprimmos
			System.out.print(imprimir+" ");
		}

		System.out.print("Inserte lo numeros que quiera intercambiar(3 5): ");			//pedimos numeros
		viejo=Integer.parseInt(sc.next());
		nuevo=Integer.parseInt(sc.next());

		for (int i=0;i<numeros.length;i++){
			if(Integer.parseInt(numeros[i])==viejo){
				numeros[i]=("'"+nuevo+"'");
			}
		}
		for(String imprimir:numeros){										//imprimmos
			System.out.print(imprimir+" ");
		}

	}
}