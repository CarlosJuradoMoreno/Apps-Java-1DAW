/**Escribe un programa que lea un número N e imprima una pirámide de números con N filas como
 *     en la siguiente figura: 
 *          1 
 *         121
 *        12321 
 *       1234321
 * 
 * @author Carlos Jurado Moreno
 * */
public class C05ej24 {
	public static void main(String [] args){

		    System.out.println("Introduzca la altura de la piramide: ");
		    int alturaMax=4;
			alturaMax= Integer.parseInt(System.console().readLine());

	    int altura = 1;
	    int i = 0;
	    int espacios = alturaMax - 1;
	    
	    while (altura <= alturaMax) {
	     
	      for (i = 1; i <= espacios; i++) {
	        System.out.print(" ");
	      }
	      for (i = 1; i < altura; i++) {
	        System.out.print(i);
	      }
	      for (i = altura; i > 0; i--) {
	        System.out.print(i);
	      }
	      
	      System.out.println();
	      altura++;
	      espacios--;
	    }
	}
}
	  
