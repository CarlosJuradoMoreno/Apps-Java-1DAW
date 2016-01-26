/**Realiza un programa que sea itez de rotar todos los elementos de una n cuadrada una
posición en el sentido de las agujas del reloj. La n debe tener 12 filas por 12 columnas
y debe contener números generados al azar entre 0 y 100. Se debe mostrar tanto la n
original como la n resultado, ambas con los números convenientemente alineados.
*@author Carlos Jurado Moreno
**/
public class C07biej09{
	public static void main(String[] args) {
		int [][] n= new int [12][12];
		int [][] salida= new int [12][12];  
		int aux1=0;
		int aux2=0;
		int finIte;

		for (int i=0;i<n.length;i++){
			for (int j=0; j<n.length;j++){
				n[i][j]=(int)(Math.random()*101);
			}
		}
				//original
		for (int i=0;i<n.length;i++){
			for (int j=0; j<n.length;j++){
				System.out.printf(" %2d",n[i][j]);
			}
			System.out.println();
		}


		for (int ite=0;ite<6;ite++){
      
		    // rota por arriba
		    aux1 = n[ite][11 - ite];
		    for (int i = 11 - ite; i > ite; i--) {
		      n[ite][i] = n[ite][i - 1];
		    }
		       
		    // rota por la derecha      
		     aux2 = n[11 - ite][11 - ite];
		    for (int i = 11 - ite; i > ite + 1; i--) {
	       n[i][11 - ite] = n[i - 1][11 - ite];
	     }
	     n[ite + 1][11 - ite] = aux1;
		      
	     // rota por abajo
	     aux1 = n[11 - ite][ite];
	     for (int i = ite; i < 11 - ite - 1; i++) {
	       n[11 - ite][i] = n[11 - ite][i + 1];
	     }
	     n[11 - ite][11 - ite - 1] = aux2;
		        
	     // rota por la izquierda
		    for (int i = ite; i < 11 - ite - 1; i++) {
		      n[i][ite] = n[i + 1][ite];
		    }
		    n[11 - ite - 1][ite] = aux1;
		}
System.out.println();System.out.println(aux2);

System.out.println();System.out.println();

		for (int i=0;i<n.length;i++){
			for (int j=0; j<n.length;j++){
				System.out.printf(" %2d",n[i][j]);
			}
			System.out.println();
		}
	}
}