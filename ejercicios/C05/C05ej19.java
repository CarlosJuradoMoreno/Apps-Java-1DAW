/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura
 * se debe pedir por teclado. El carácter con el que se pinta la pirámide
 * también se debe pedir por teclado.
 * 
 * @author Carlos Jurado Moreno
 */
public class C05ej19{
  public static void main(String[] args){
    int altura;
    String caracter;
    String linea="";
    do{
      System.out.println("Inserte la altura: ");
      altura=Integer.parseInt(System.console().readLine());
      System.out.print("Inserte el caracter: ");
      caracter=System.console().readLine();
    }while (altura<=0);
    
    for(int i=0;i<altura;i++){
      for (int j=0;j<(altura)-i;j++){
        linea+=caracter+" ";
      }
      linea+="\n";
      for (int e=0;e<=i;e++){
        linea+=" ";
      }
    }
   
    
    for(int i=altura;i>=0;i--){
      for (int e=0;e<=i-1;e++){
        linea+=" ";
        }
      for (int j=(altura-i);j>0;j--){
        linea+=caracter+" ";
      }
      linea+="\n";
        
      }
     System.out.println(linea);
    
  }
}
