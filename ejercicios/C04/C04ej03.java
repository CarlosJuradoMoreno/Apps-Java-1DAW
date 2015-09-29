//Carlos Jurado Moreno 
public class C04ej03{
  public static void main(String[] args){
    int dia;
    
    System.out.println("Inserte un numero del 1 al 7 entero");
    dia=Integer.parseInt(System.console().readLine());
    if((dia<1)&&(dia>7)){
      System.out.println("Inserte un valor valido ");
    }else{
      switch (dia){
      case 1:
      System.out.println("Lunes");
      break;
      case 2:
      System.out.println("Martes");
      break;
      case 3:
      System.out.println("Miercoles");
      break;
      case 4:
      System.out.println("Jueves");
      break;
      case 5:
      System.out.println("Viernes");
      break;
      case 6:
      System.out.println("Sabado");
      break;
      case 7:
      System.out.println("Viernes");
      break;
      }

    }
  }
}
