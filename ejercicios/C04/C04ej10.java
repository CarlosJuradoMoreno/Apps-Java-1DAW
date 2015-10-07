//carlos jurado moreno
import java.util.*;
public class C04ej10{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int dia, mes;
    System.out.println("Inserte dia y mes de nacimiento ej(27 2)");
    dia=Integer.parseInt(sc.next());
    mes=Integer.parseInt(sc.next());
    if(mes<1||mes>12){
      System.out.println("ERROR MES INCORRECTO");
    }else{
      if (dia<0||dia>31){
        System.out.println("ERROR DIA INCORRECTO");
      }else{
        if(mes==2&&dia>28){
          System.out.println("ERROR DIA INCORRECTO");
        }else{
          if((mes==4||mes==6||mes==9||mes==11)&&(dia==31)){
            System.out.println("ERROR DIA INCORRECTO");
          }else{
            if((mes==3&&dia>=21)||(mes==4&&dia<=20)){
              System.out.println("Eres Aries");
            }
            if((mes==4&&dia>=21)||(mes==5&&dia<=20)){
              System.out.println("Eres Tauro");
            }
            if((mes==5&&dia>=21)||(mes==6&&dia<=20)){
              System.out.println("Eres Géminis");
            }
            if((mes==6&&dia>=21)||(mes==7&&dia<=20)){
              System.out.println("Eres Cáncer");
            }
            if((mes==7&&dia>=21)||(mes==8&&dia<=20)){
              System.out.println("Eres Leo");
            }
            if((mes==8&&dia>=21)||(mes==9&&dia<=20)){
              System.out.println("Eres Virgo");
            }
            if((mes==9&&dia>=21)||(mes==10&&dia<=20)){
              System.out.println("Eres Libra");
            }
            if((mes==10&&dia>=21)||(mes==11&&dia<=20)){
              System.out.println("Eres Escorpio");
            }
            if((mes==11&&dia>=21)||(mes==12&&dia<=20)){
              System.out.println("Eres Sagitario");
            }
            if((mes==12&&dia>=21)||(mes==1&&dia<=20)){
              System.out.println("Eres Capricornio");
            }
            if((mes==1&&dia>=21)||(mes==2&&dia<=20)){
              System.out.println("Eres Acuario");
            }
            if((mes==2&&dia>=21)||(mes==3&&dia<=20)){
              System.out.println("Eres Piscis");
            }
          }
        }
      }
    }
    
  }
}
