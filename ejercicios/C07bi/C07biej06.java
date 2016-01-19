/**Modifica el programa anterior de tal forma que no se repita ningún número en el array.
*@Author Carlos Jurado Moreno
**/
public class C07biej06{
	public static void main(String[] args) {
		int[][] m=new int[6][10];
		int maximo=0;
		int minimo=1000;
		int posXMin=0;
		int posYMin=0;
		int posXMax=0;
		int posYMax=0;
		int aleatorio;
		boolean esta=false;

		//rellenamos el array
		for (int f=0;f<m.length;f++){
			for (int c=0;c<m[f].length;c++){
				esta=false;
				aleatorio=(int)(Math.random()*100);

				for(int i=0;(i<m.length)&&!esta;i++){
					for(int j=0;(j<m[i].length)&&!esta;j++){
						if(aleatorio==m[i][j]){
							esta=true;
						}
					}

				}											//comprobacion de que no se repiten

				if(!esta){
					m[f][c]=aleatorio;
				


					if((f==0)&&(c==0)){
						maximo=m[f][c];							//Almacenamos el 1º valor como maximo y minimos y guardamos las coordenadas del mismo
						minimo=m[f][c];
						posXMin=f;
						posYMin=c;
						posXMax=f;
						posYMax=c;
					}else if(m[f][c]<minimo){					//si el munero es el minimo, almacenamos el valor y las coordenadas
						minimo=m[f][c];
						posXMin=f;
						posYMin=c;

					}else if(m[f][c]>maximo){					//si el numero es el maximo, almacenamos el valor y las coordendas
						maximo=m[f][c];
						posXMax=f;
						posYMax=c;
					}
				}else{
					c--;
				}
			}
		}

		//Imprimimos el array para ver lo que hemos escrito(NO NECESARIO)
		for (int f=0;f<m.length;f++){
			for (int c=0;c<m[f].length;c++){
				System.out.printf("%8d", m[f][c]);
			}
			System.out.println();
		}


		//Sacamos el maximo y minimo junto a sus coordenadas 
		System.out.println("Maximo= "+maximo+"("+(posXMax+1)+","+(posYMax+1)+")");
		System.out.println("Minimo= "+minimo+"("+(posXMin+1)+","+(posYMin+1)+")");
	}
}