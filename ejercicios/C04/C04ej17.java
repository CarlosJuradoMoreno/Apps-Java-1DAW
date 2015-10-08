//Carlos Jurado Moreno
public class C04ej17{
  public static void main(String[] args){
    int num;
    int res;
    double ultimodigito;
    double moduloultimo;
    System.out.println("Inserta un numero entero");
    num=Integer.parseInt(System.console().readLine());
    ultimodigito=(double) num;
    ultimodigito=ultimodigito/10;
    moduloultimo=ultimodigito%10;
    res=(int) (moduloltimo*10);
    
    System.out.print("Su numero es: "+res);
  }
}
