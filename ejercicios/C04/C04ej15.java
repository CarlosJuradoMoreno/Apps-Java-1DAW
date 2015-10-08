//Carlos Jurado Moreno
import java.util.*;
public class C04ej15{
  public static void main (String[] args){
    Scanner sc= new Scanner(System.in);
    String s;
    String direccion;
    
    System.out.println("Inserte el simbolo con el que quieras rellenar la piramide y junto a el, la dirrecion(up down right left) separado por un espacio. Ej (* u)");
    s=sc.next().toLowerCase();
    direccion=sc.next();
    
    switch (direccion){
      case "up":
      System.out.println("  "+s+"  ");
      System.out.println(" "+s+s+s+" ");
      System.out.println(s+s+s+s+s);
      break;
      case "down":
      System.out.println(s+s+s+s+s);
      System.out.println(" "+s+s+s+" ");
      System.out.println("  "+s+"  ");
      break;
      case "right":
      System.out.println(s+"  ");
      System.out.println(s+s+" ");
      System.out.println(s+s+s+"");
      System.out.println(s+s+" ");
      System.out.println(s+"  ");
      break;
      case "left":
      System.out.println("  "+s);
      System.out.println(" "+s+s);
      System.out.println(s+s+s+"");
      System.out.println(" "+s+s);
      System.out.println("  "+s);
      break;
    }
  }
}
