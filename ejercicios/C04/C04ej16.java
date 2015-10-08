//Carlos Jurado Moreno
public class C04ej16{
  public static void main(String[] args){
    System.out.println("Bienvenido al test de infidelidad, Solamente tienes que responder v o f");
    System.out.println("Pregunta 1: ¿Crees que tu pareja esta siendote infiel?");
    int puntuacion=0;
    if(System.console().readLine().toLowerCase().compareTo("v")==0){
      puntuacion+=5;
    }
    System.out.println("¿Estas seguro?");
    if(System.console().readLine().toLowerCase().compareTo("v")==0){
      puntuacion+=5;
    }
    
    if(puntuacion==10){
      System.out.println("Tu pareja te es infiel");
    }
    if (puntuacion==5){
      System.out.println("Tu pareja probablemente te es infiel o no");
    }
    if(puntuacion==0){
      System.out.println("Tu pareja no te es infiel");
    }
  }
}
