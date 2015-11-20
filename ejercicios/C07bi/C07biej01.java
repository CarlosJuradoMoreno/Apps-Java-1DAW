/**Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna
los valores según la siguiente tabla. Muestra el contenido de todos los elementos del array
dispuestos en forma de tabla como se muestra en la figura.
@author Carlos Jurado Moreno
**/
public class C07biej01{
	public static void main(String[] args) {
		int f=4;
		int c=6;
		String[][] tabla= new String[f][c];
//Inicializamos el array vaciandolo
		for(int i=0;i<tabla.length;i++){
			for(int j=0;j<tabla[i].length;j++){
				tabla[i][j]="";
			}
		}

//Insertamos los datos manualmente
		tabla[1][1]="0";
		tabla[1][2]="30";
		tabla[1][3]="2";
		tabla[1][5]="5";
		tabla[2][1]="75";
		tabla[2][5]="0";
		tabla[3][2]="-2";
		tabla[3][3]="9";
		tabla[3][5]="11";
//imprimir matriz
		for(int i=0;i<tabla.length;i++){
			for (int j=0;j<tabla[i].length;j++){
//Construimos los margenes
				if(i==0&&j!=0){
					System.out.print("Columna "+j+" ");
				}
				if (i==0&&j==0){
					System.out.print("Array num ");
				}
				if(i!=0&&j==0){
					System.out.printf("Fila "+i+" ");
				}

//rellenamos la tabla con los valores
				if(i!=0&&j!=0){
					System.out.printf("%10s",tabla[i][j]+" ");
				}
			}
			System.out.println();
		}
}
}