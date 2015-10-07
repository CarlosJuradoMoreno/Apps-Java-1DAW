//Carlos Jurado Moreno
public class C04ej12{
  public static void main(String[] args){
    int calificacion=0;
    String res1,res2;
    res1="si";
    res2="Seguramente no";
    System.out.println("Bienvenido al test, asegurate de escribir correctamente las respuestas");
    System.out.println("Primera pregunta:\n No se me ocurre ninguna pregunta, ¿A ti sí?\n a) si \n b) no");
    if (System.console().readLine().compareTo("si")==0){
      calificacion+=5;
    }
      System.out.println("Segunda pregunta:\n¿Crees que voy a tirarme mucho rato para pensar mas pregunta?\n a) Of course!\n b) Seguramente no\n c) Esta opción no es");
      if (System.console().readLine().compareTo("Seguramente no")==0){
      calificacion+=5;
    }
    System.out.println("Su calificacion es de "+calificacion);
  }
}
