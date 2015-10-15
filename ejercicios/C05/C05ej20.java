/**
  
 *Igual que el ejercicio anterior pero esta vez se debe pintar una
 *pirámide hueca.
 * 
 * @author Carlos Jurado Moreno
 */
 
public class C05ej20{
  public static void main(String[] args){
    int altura;
    String caracter;
    String piramide="";
    int ancho;
    
    do{
      System.out.println("Inserte la altura: ");
      altura=Integer.parseInt(System.console().readLine());
      System.out.print("Inserte el caracter: ");
      caracter=System.console().readLine();
    }while (altura<=0);
    
    ancho=(altura*2)-1;
    for (int i=1; i<=altura;i++){                     //altura
      int ancholinea = (i*2)-1;
      int espacios=(ancho-ancholinea)/2;
      
      for (int j=1;j<=ancho;j++){                      //Linea
        if((j==espacios+1)||(j==(ancho-espacios))||((i==altura))){
          piramide+=caracter;
        }else{
          piramide+=" ";
        }
      }
      
      piramide+="\n";
    }
    System.out.println(piramide);
  }
}
