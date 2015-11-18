/**Realiza un programa que pida 8 números enteros y que luego muestre esos números junto
*con la palabra par o impar según proceda.
*@author Carlos Jurado Moreno
**/
public class C07ej09{
	public static void main(String[] args) {
		int contador=0;
		int numeros[]= new int[8];
		do{

			System.out.print("Inserte el "+(contador+1)+" numero: ");
			numeros[contador]=Integer.parseInt(System.console().readLine());
			contador++;
		}while(contador<8);

		for (int i=0; i<numeros.length;i++){
			if (numeros[i]%2==0){
				System.out.println(i[numeros]+" Par");
			}else{
				System.out.println(numeros[i]+" Impar");
			}
		}
	}
}