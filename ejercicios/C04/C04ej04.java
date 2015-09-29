//Carlos Jurado Moreno
public class C04ej04{
  public static void main (String[] args){
    int horas;
    int nomina;
    System.out.println("Inserte el numero de horas trabajadas :");
    horas= Integer.parseInt(System.console().readLine());
    if (horas>40){
      nomina = 40*12;
      horas-=40;
      nomina+= horas*16;
    }else {
      nomina= horas*12;
    }
    System.out.println("Su nomina asciende a "+nomina+"€");
  }
}
