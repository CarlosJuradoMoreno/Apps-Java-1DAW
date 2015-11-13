/** Escribe un programa que pida 10 números por teclado y que luego muestre los números
*introducidos junto con las palabras máximo y mínimo al lado del máximo y del mínimo
*respectivamente
*@author Carlos Jurado Moreno
**/
public class C07ej05{
	public static void main(String[] args) {
		String[] numeros= new String [10];
		int contador=0;
		int maximo=0;
		int minimo=0;
		int indiceMax=0;
		int indiceMin=0;
		
		do{

			System.out.print("Inserte el "+(contador+1)+" numero: ");
			numeros[contador]=System.console().readLine();
			contador++;

		}while(contador<10);

		for(int i=0; i< numeros.length;i++){
			
			if(i==0){
				maximo=Integer.parseInt(numeros[i]);
				minimo=Integer.parseInt(numeros[i]);
				indiceMax=i;
				indiceMin=i;
			}

			if(maximo<=Integer.parseInt(numeros[i])){
				maximo=Integer.parseInt(numeros[i]);
				indiceMax=i;
			}
			
			if(minimo>Integer.parseInt(numeros[i])){
				minimo=Integer.parseInt(numeros[i]);
				indiceMin=i;
			}
		}

		for(int i=0;i<numeros.length;i++){
			if(i==indiceMax){
				System.out.println(numeros[i]+" Maximo");
			}else if(i==indiceMin){
				System.out.println(numeros[i]+" Minimo");
			}else{
				System.out.println(numeros[i]);
			}
		}
	}
}