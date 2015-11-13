/**Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota
*los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición
*1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
*posición 0. Finalmente, muestra el contenido del array.
**/
public class C07ej06{
	public static void main (String[] args){
		int[] numeros=new int[15];
		int posicionSiguiente=0;
		int contador=0;
		do{

			System.out.print("Inserte el "+(contador+1)+" numero: ");
			numeros[contador]=Integer.parseInt(System.console().readLine());
			contador++;

		}while(contador<15);

		for(int i =0;i<numeros.length;i++){
			int aux;
			if(i==0){
				posicionSiguiente=numeros[i];
				numeros[i]=numeros[14];
			}else{
				aux=posicionSiguiente;
				posicionSiguiente=numeros[i];
				numeros[i]=aux;
			}
		}
		System.out.print(numeros);
		for(int imprimir:numeros){
			System.out.println(imprimir);
		}
	}	

}