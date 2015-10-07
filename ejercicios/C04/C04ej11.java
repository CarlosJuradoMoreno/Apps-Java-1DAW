//Carlos Jurado Moreno
import java.util.*;
public class C04ej11{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int hora, min,seg, res;
    int medianoche=86400;
    System.out.println("Inserte una hora (16 27)");
    hora=Integer.parseInt(sc.next());
    min=Integer.parseInt(sc.next());
    if(((hora<0&&hora>23)&&(min<0&&min>60))){
      System.out.println("ERROR DE HORA");
    }else{
      min+=hora*60;
      seg=min*60;
      res=medianoche-seg;
      System.out.println("Quedan "+res+" segundos para la media noche");
    }
    
  }
}
