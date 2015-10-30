/**Realiza un programa que pida primero un número y a continuación un dígito. El programa nos
 *debe dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese dígito en
 *el número introducido.
 * 
 * @author Carlos Jurado Moreno
 */
 
public class C05ej26{
  public static void main(String[] args){
    int numero;
    int digito;
    int posicion=1;
    String reves="";
    int cambio=0;
    
    System.out.print("Inserte el numero: ");
    numero=Integer.parseInt(System.console().readLine());
    System.out.print("Inserte el digito: ");
    digito=Integer.parseInt(System.console().readLine());
    System.out.println("El numero "+numero+" Aparece en las posiciones");
    
     while(numero>0){
    reves+= (numero%10);
    numero= (int) numero/10;
    }
    
    cambio=Integer.parseInt(reves);
    
    while(cambio>0){
      if((cambio%10)==digito){
        System.out.print(posicion+" ");
        
      }
    
      cambio= (int)cambio/10;
      posicion++;
    }
  }
 }
