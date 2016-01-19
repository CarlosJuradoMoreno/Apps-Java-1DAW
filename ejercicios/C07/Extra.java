public class extra{
	public static void main(String[] args) {
		int[] pares;
		int indicePares=0;
		int[] impares;
		int indiceImpares=0;
		int[] numeros= new int[20];

		for (int i=0;i<numeros.length;i++){
			numeros[i]=(int)(Math.random()*101);
		}

		for (int i=0; i<numeros.length;i++){
			if (numeros[i]%2==0){
				indicePares++;
			}else{
				indiceImpares++;
			}
		}

		pares= new int [indicePares];						//definimos tamaño de los arrays
		impares= new int [indiceImpares];
		indiceImpares=0;
		indicePares=0;

		for (int i=0; i<numeros.length;i++){
			if (numeros[i]%2==0){
				pares[indicePares]=numeros[i];
				indicePares++;
			}else{
				impares[indiceImpares]=numeros[i];
				indiceImpares++;
			}
		}
		for (int i=0; i<pares.length;i++){
			numeros[i]=pares[i];
		}
		indiceImpares=0;
		
		for (int i=indicePares;i<numeros.length;i++){
			numeros[i]=impares[indiceImpares];
			indiceImpares++;
		}
		System.out.print("Array cambiado: ");
		for (int i:numeros){
			
			System.out.print(i+" ");

		}
	}
}