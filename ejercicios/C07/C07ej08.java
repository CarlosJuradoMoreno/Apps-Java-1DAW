/**Realiza un programa que pida la temperatura media que ha hecho en cada mes de un
determinado año y que muestre a continuación un diagrama de barras horizontales con
esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro
carácter
**/
public class C07ej08{
	public static void main(String[] args) {
		int[] temperaturas = new int[12];
		String mes="";
		String caracter="";

		for(int i=0;i<temperaturas.length;i++){
			switch (i){
				case 0:
				mes="Enero";
				break;
				case 1:
				mes="Febrero";
				break;
				case 2:
				mes="Marzo";
				break;
				case 3:
				mes="Abril";
				break;
				case 4:
				mes="Mayo";
				break;
				case 5:
				mes="Junio";
				break;
				case 6:
				mes="Julio";
				break;
				case 7:
				mes="Agosto";
				break;
				case 8:
				mes="Septiembre";
				break;
				case 9:
				mes="Octubre";
				break;
				case 10:
				mes="Noviembre";
				break;
				case 11:
				mes="Diciembre";
				break;
			}
			System.out.print("Inserte la temperatura media para "+mes+" ");
			temperaturas[i]=Integer.parseInt(System.console().readLine());
		}
		System.out.print("Inserte el caracter con el que quieras rellenar: ");
		caracter=System.console().readLine();

		for(int i=0;i<temperaturas.length;i++){
			switch (i){
				case 0:
				mes="Enero: ";
				break;
				case 1:
				mes="Febrero: ";
				break;
				case 2:
				mes="Marzo: ";
				break;
				case 3:
				mes="Abril: ";
				break;
				case 4:
				mes="Mayo: ";
				break;
				case 5:
				mes="Junio: ";
				break;
				case 6:
				mes="Julio: ";
				break;
				case 7:
				mes="Agosto: ";
				break;
				case 8:
				mes="Septiembre: ";
				break;
				case 9:
				mes="Octubre: ";
				break;
				case 10:
				mes="Noviembre: ";
				break;
				case 11:
				mes="Diciembre: ";
				break;
			}
			System.out.printf("%13.40s ",mes);

			for(int j=0;j<temperaturas[i];j++){
				System.out.printf(caracter);
			}														//hacerlo con un array de arrays, o dibujando el mapa con un array bidimiensional
			System.out.print("\n");
		}
	}
}