//Carlos Jurado Moreno
public class C04ej14{
  public static void main(String[] args){
    double num;
    System.out.print("Interte un numero ");
    num=Integer.parseInt(System.console().readLine());
    
    if((num%2==0)&&(num%5==0)){
      System.out.println("El numero es divisible por 2 y por 5");
    }else    
    if(num%2==0){
      System.out.println("El numero es divisible por 2");
    }else
    if (num%5==0){
      System.out.println("El numero es divisible por 5");
    }else{
      System.out.println("El numero no es divisible ni por 5 ni por 2");
    }
  }
}
