/**Modifica el programa anterior de tal forma que las sumas parciales y la suma total
aparezcan en la pantalla con un pequeño retardo, dando la impresión de que el ordenador
se queda pensando antes de mostrar los números.
@author Carlos Jurado Moreno
**/
public class C07biej04{
	public static void main(String[] args) throws InterruptedException{
		Thread hiloA= new Thread();
		int[][] m=new int[4][5];
		int total=0;
		int parcialFila=0;
		int parcialColumna=0;
		
//Pedimos los datos
		hiloA.start();

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
					hiloA.sleep(300);
					System.out.printf("%8d", total*2);
				}else 
					if(f==(m.length-1)||c==(m[f].length-1)){
						hiloA.sleep(300);
						System.out.printf("%8d", m[f][c]);
					}else{
						System.out.printf("%8d", m[f][c]);
				}
			}
			System.out.println();
		}
	}
}