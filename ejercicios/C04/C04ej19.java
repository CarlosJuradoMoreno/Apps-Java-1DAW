//Carlos Jurado Moreno
public class C04ej19{
  public static void main(String[] args){
    int numero;
    int digitos=0;
    System.out.print("Inserte un numero entero de no mas de 5 digitos");
    numero=Math.abs(Integer.parseInt(System.console().readLine()));
    if(((numero>10000))){
      System.out.println("Error: Numero de mas de 5 digitos");
    }else{
      if(numero<10){
        digitos=1;
      }
      if((numero>=10)&&(numero<100)){
        digitos=2;
      }
       if((numero>=100)&&(numero<1000)){
        digitos=3;
      }
       if((numero>=1000)&&(numero<10000)){
        digitos=4;
      }
      if((numero>=10000)&&(numero<100000)){
        digitos=5;
      }
      System.out.println("El numero tiene "+digitos+" digitos");
    }
  }
}
