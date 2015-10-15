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
      //dibujo linea
      for (int j=0;j<(altura)-i;j++){
        linea+=caracter+" ";
      }
      linea+="\n";
      //dibujo espacios
      for (int e=0;e<=i;e++){
        linea+=" ";
      }
    }
   
   
    for(int i=altura;i>=0;i--){   
      //dibujo espacios
      for (int e=0;e<=i-1;e++){
        linea+=" ";
        }
        //dibujo linea
      for (int j=(altura-i);j>0;j--){
        linea+=caracter+" ";
      }
      linea+="\n";
        
      }
     System.out.println(linea);
    
    
    
    
/**
 * int altura;
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
        if(j<=espacios||j>ancho-espacios){
          piramide+=" ";
        }else{
          piramide+=caracter;
        }
        
      }
      piramide+="\n";
    }
    System.out.println(piramide);
  }
}
 **/
  }
}
