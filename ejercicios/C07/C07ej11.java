/**Realiza un programa que pida 10 números por teclado y que los almacene en un array.
A continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando
para ello una tabla. Seguidamente el programa pasará los primos a las primeras posiciones,
desplazando el resto de números (los que no son primos) de tal forma que no se pierda
ninguno. Al final se debe mostrar el array resultante.

 @author Carlos Jurado Moreno
**/
public class C07ej11{
	public static void main(String[] args) {
		int[] numeros= new int[10];
		int contador=0;
		int[] primos=new int[10];
		int[] noPrimos=new int[10];
		int indicePrimo=0;
		int indiceNoPrimo=0;
		int numero;
		boolean primo=true;

		do{
			System.out.print("Inserte el "+(contador+1)+" numero: ");
			numero=Integer.parseInt(System.console().readLine());
			numeros[contador]=numero;
			

			for (int i=2;i<=(numero)/2;i++){				//comprobamos si es primo
				if((numero==4)||(numero%i==0)){
					primo=false;
				}	
			}
			
			if(primo){									//guardamos en los arrays.
				primos[indicePrimo]=numero;
				indicePrimo++;
			}else{
				noPrimos[indiceNoPrimo]=numero;
				indiceNoPrimo++;
			}
			contador++;
			primo=true;
		}while(contador<10);
		
				
		for (int i=0;i<indicePrimo;i++){
			numeros[i]=primos[i];

		}
		
		indiceNoPrimo=0;
		for (int i=indicePrimo;i<10;i++){
			numeros[i]=noPrimos[indiceNoPrimo];
			indiceNoPrimo++;
		}
		for(int i:numeros){
			System.out.print(i+" ");
		}	    
		}
}