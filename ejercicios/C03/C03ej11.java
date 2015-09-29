//Carlos Jurado Moreno
public class C03ej11{
  public static void main(String[] args){
    long int mb;
    long int kb;
    int cambio=1024;
    System.out.println("Inserte el numero de Kb que desea transformar");
    kb= Integer.parseInt(System.console().readLine());
    
    mb=kb/cambio;
    System.out.println(kb+" Kb son "+mb+" Mb");
  }
}
