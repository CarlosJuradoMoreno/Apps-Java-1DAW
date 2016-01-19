/**Modifica el programa anterior de tal forma que los números que se introducen en el array
se generen de forma aleatoria (valores entre 100 y 999).
@author Carlos Jurado Moreno
**/
public class C07biej03{
	public static void main(String[] args) {
		int[][] m=new int[4][5];
		int total=0;
		int parcialFila=0;
		int parcialColumna=0;
		
//Pedimos los datos

		for(int f=0;f<m.length-1;f++){
			for(int c=0;c<m[f].length-1;c++){
				m[f][c]=(int)(Math.random()*900)+100;
				
				m[m.length-1][c]+=m[f][c]; 
				m[f][m[f].length-1]+=m[f][c];
			}
			total+=m[f][m[f].length-1];
		}
//Imprimimos
		for(int f=0;f<m.length;f++){
			for(int c=0;c<m[f].length;c++){
				if((f==(m.length-1))&&(c==(m[f].length-1))){
					System.out.printf("%8d", total*2);
				}else{
					System.out.printf("%8d", m[f][c]);
				}
			}

			

			System.out.println();
		}
	}
}