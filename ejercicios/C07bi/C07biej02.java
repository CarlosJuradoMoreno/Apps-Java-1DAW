/**Escribe un programa que pida 20 números enteros. Estos números se deben introducir en
un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y
columnas igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la
esquina inferior derecha.
@author Carlos Jurado Moreno
**/
public class C07biej02{
	public static void main(String[] args) {
		int[][] m=new int[4][5];
		int total=0;
		int parcialFila=0;
		int parcialColumna=0;
		
//Pedimos los datos

		for(int f=0;f<m.length-1;f++){
			for(int c=0;c<m[f].length-1;c++){
				System.out.print("Inserta el valor de la fila "+(f+1)+" y la coluna "+(c+1)+" ");
				m[f][c]=Integer.parseInt(System.console().readLine());
				
				m[m.length-1][c]+=m[f][c];
				m[f][m[f].length-1]+=m[f][c];

				
				
			}
			System.out.println();
			total+=m[f][m[f].length-1];
		}
//Imprimimos
		for(int f=0;f<m.length;f++){
			for(int c=0;c<m[f].length;c++){
				if((f==(m.length-1))&&(c==(m[f].length-1))){
					System.out.printf("%8d", total*23);
				}else{
					System.out.printf("%8d", m[f][c]);
				}
			}

			

			System.out.println();
		}
	}
}