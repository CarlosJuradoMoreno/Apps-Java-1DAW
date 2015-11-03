/**
 *Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la
 *forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de
 *suspensos, el número de suficientes, el número de bienes, etc.
 *
 * @author Carlos Jurado Moreno
 */
 
 public class C06ej11{
  public static void main(String [] args){
    int nota;
    int suspenso=0;
    int suficiente=0;
    int bien=0;
    int notable=0;
    int sobresaliente=0;
    for(int i=0;i<20;i++){
      nota=(int)(Math.random()*10)+1;
      switch (nota){
        case 5:
        System.out.println(nota +" Suficiente");
        suficiente++;
        break;
        case 6:
        case 7:
        System.out.println(nota +" Bien");
        bien++;
        break;
        case 8:
        case 9:
        System.out.println(nota +" Notable");
        notable++;
        break;
        case 10:
        System.out.println(nota +" Sobresaliente");
        sobresaliente++;
        break;
        default:
        System.out.println(nota +" Suspenso");
        suspenso++;
      }
    }
    System.out.println("Suspentos: "+suspenso);
    System.out.println("Suficiente: "+suficiente);
    System.out.println("Bien: "+bien);
    System.out.println("Notable: "+notable);
    System.out.println("Sobresalientes: " +sobresaliente);
    
  }
 }
