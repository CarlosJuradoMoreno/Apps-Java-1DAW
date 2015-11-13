/** Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo.
Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben
almacenar los cuadrados de los valores que hay en el array numero. En el array cubo se
deben almacenar los cubos de los valores que hay en numero. A continuación, muestra el
contenido de los tres arrays dispuesto en tres columnas.
@author Carlos Jurado Moreno
**/
public class C07ej04{
	public static void main(String[] args) {
		int[] numero = new int[20];
		int[] cubo = new int[20];
		int[] cuadrado = new int[20];
		int contador=0;
		int entradaNumero;

		do{
			System.out.print("Inserte el "+(contador+1)+" numero: ");
			entradaNumero=Integer.parseInt(System.console().readLine());

			numero[contador]=entradaNumero;
			cuadrado[contador]=entradaNumero*entradaNumero;
			cubo[contador]=entradaNumero*entradaNumero*entradaNumero;

			contador++;
		}while(contador<numero.length);


		System.out.println("Numero \t cuadrado \t cubo");
		for(int i=0;i<numero.length;i++){
			System.out.println(numero[i]+"\t"+cuadrado[i]+"\t"+cubo[i]);
		}

	}
}