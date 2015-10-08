//Carlos Jurado Moreno
public class C04ej18{
  public static void main(String[] args){
    int numero;
    int primerDigito=0;
    System.out.print("Inserte un numero entero, no mayor de 5 cifras ");
    numero=Integer.parseInt(System.console().readLine());
    if(((numero>100000))||(numero<0)){
      System.out.println("Error: Numero de mas de 5 digitos positivo");
    }else{
      if(numero<10){
        primerDigito=numero;
      }
      if((numero>=10)&&(numero<100)){
        primerDigito=(int) (numero/10);
      }
       if((numero>=100)&&(numero<1000)){
        primerDigito=(int) (numero/100);
      }
       if((numero>=1000)&&(numero<10000)){
        primerDigito=(int) (numero/1000);
      }
      if((numero>=10000)&&(numero<100000)){
        primerDigito=(numero/10000);
      }
      System.out.print("El primer digito de tu numero es: "+primerDigito);
  }
  }
}
