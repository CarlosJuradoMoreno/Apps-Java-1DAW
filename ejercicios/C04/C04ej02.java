//Carlos Jurado Moreno
public class C04ej02{
   public static void main(String[] args){
      int hora=0;
      
      System.out.println("Inserte una hora, (sin minutos ni segundos)");
      try{
      hora=Integer.parseInt(System.console().readLine());
    } catch(NumberFormatException e){
      System.out.println("Enteros!!");
      }
      String res;
      if ( hora >=6 && hora<=12 ){
        res="Buenos dias";
      }
      else if (hora>=13&&hora<=20){
        res= "Buenas tardes";
      }
      else if((hora>=21&&hora<=24)||(hora>=1&&hora<=5)){
        res="Buenas noches";
      }else{
        res="error de hora";
      }
      System.out.println(res);
   }
}
