/**
 *Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
 *El carácter con el que se pinta cada línea se elige de forma aleatoria entre
 *uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
 *aleatoria entre 1 y 40 caracteres.
 *
 * @author Luis José Sánchez
 */
 
 public class C06ej10{
  public static void main(String [] args){
    int numCaracter;
    String caracter="";
    
    for (int i=0;i<10;i++){
      numCaracter=(int)(Math.random()*6)+1;
      switch(numCaracter){
        case 1:
        caracter="*";
        break;
        case 2: 
        caracter="-";
        break;
        case 3:
        caracter="=";
        break;
        case 4:
        caracter=".";
        break;
        case 5:
        caracter="|";
        break;
        case 6:
        caracter="@";
        break;
      }
       for (int j=(int)(Math.random()*40)+1;j<=40;j++){
        System.out.print(caracter);
       }
       System.out.println("");
    }
  }
 }

 
