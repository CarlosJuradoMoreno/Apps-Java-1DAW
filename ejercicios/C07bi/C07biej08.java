/**Escribe un programa que, dada una posicion en un tablero de ajedrez, nos diga a qué casillas
podria saltar un alfil que se encuentra en esa posicion. Como se indica en la figura, el alfil
se mueve siempre en diagonal. El tablero cuenta con 64 casillas. Las columnas se indican
con las letras de la a a la h y las filas se indican del 1 al 8.
*@author Carlos Jurado Moreno
**/
public class C07biej08{
	 public static void main(String[] args) {
		int[][] tablero = new int[8][8];
		char letra;
		int posicionNum;
		int posicionLetra;
		int FICHA=1;
		
		int MOVIMIENTO=2;
		int posX;
		int posY;

		for(int i=0;i<8;i++){	//llenamos de 0 el array
			for(int j=0;j<8;j++){
				tablero[i][j]=0;
			}
		}	
		System.out.print("Inserte la letra ");
		letra=System.console().readLine().charAt(0);
		System.out.print("Inserte el numero ");
		posicionNum=Integer.parseInt(System.console().readLine());
		posicionLetra=letra-96;
		tablero[posicionLetra-1][posicionNum-1]=FICHA;
		System.out.println("El alfil puede moverse a las posiciones: ");
		
		//Rellenamos para la 1era linea
		posX=posicionLetra-1;
		posY=posicionNum-1;				
		while(posX>0&&posY>0){
				posX--;
				posY--;	
				tablero[posX][posY]=MOVIMIENTO;
			}

			//Rellenamos para la segunda linea
		posX=posicionLetra-1;
		posY=posicionNum-1;				
		while(posX<7&&posY>0){
				posX++;
				posY--;	
				tablero[posX][posY]=MOVIMIENTO;
			}

			//Rellenamos para la tercera linea
		posX=posicionLetra-1;
		posY=posicionNum-1;				
		while(posX>0&&posY<7){
				posX--;
				posY++;	
				tablero[posX][posY]=MOVIMIENTO;
			}

			//Rellenamos para la Cuarta linea
		posX=posicionLetra-1;
		posY=posicionNum-1;				
		while(posX<7&&posY<7){
				posX++;
				posY++;	
				tablero[posX][posY]=MOVIMIENTO;
			}


		for (int i=0;i<8;i++){
			for (int j=0;j<8;j++){
				if(tablero[i][j]==2){
					letra=(char)(97+i);
					System.out.print(letra+""+j+" ");
				}
			}
		}

		System.out.println();


			//debug
		for (int i=0;i<8;i++){
			for (int j=0;j<8;j++){
				System.out.print(tablero[i][j]+" ");
			}
			System.out.println();
		}






		
		
		
	}
}