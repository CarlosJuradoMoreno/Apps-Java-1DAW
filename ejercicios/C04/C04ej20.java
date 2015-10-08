//Carlos Jurado Moreno
public class C04ej20{
  public static void main(String[] args){
    int numero;
    int digitos=0;
    int dig1;
    int dig2;
    int dig3;
    int dig4;
    int dig5;
    boolean capicua=false;
    System.out.print("Inserte un numero entero de no mas de 5 digitos");
    numero=Math.abs(Integer.parseInt(System.console().readLine()));
    if(((numero>100000))){
      System.out.println("Error: Numero de mas de 5 digitos");
    }else{
      if(numero<10){
        digitos=1;
        capicua=true;
      }
      if((numero>=10)&&(numero<100)){
        dig1=numero/10;
        dig2=numero%10;
        if(dig1==dig2){
          capicua=true;
        }
      }
        
       if((numero>=100)&&(numero<1000)){
        dig1=numero/100;
        dig2=numero%10;
        if(dig1==dig2){
          capicua=true;
        }
      }
       if((numero>=1000)&&(numero<10000)){
        dig1=numero/1000;
        dig2=numero%10;
        dig3=(numero/100)-(dig1*10);
        dig4=(numero%100)/10;
        if(dig1==dig2&&dig3==dig4){
          capicua=true;
        }
      }
      if((numero>=10000)&&(numero<100000)){
        dig1=numero/10000;
        dig2=numero%10;
        dig3=(numero/1000)-(dig1*10);
        dig4=(numero%100)/10;
        if(dig1==dig2&&dig3==dig4){
         
          capicua=true;
        }
      }
      if(capicua){
        System.out.println("Es capicua");
      } else{
        System.out.println("No es capicua");
      }
      
    }
  
  }
}
