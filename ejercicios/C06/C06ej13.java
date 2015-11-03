/**
 *Escribe un programa que simule la tirada de dos dados. El programa deberá
 *continuar tirando los dados una y otra vez hasta que en alguna tirada los
 *dos dados tengan el mismo valor.
 *
 * @author Luis José Sánchez
 */
 public class C06ej13{
  public static void main(String [] args){
    boolean iguales=false;
    int dado1=0;
    int dado2=0;
    while(!iguales){
      dado1=(int)(Math.random()*6)+1;
      dado2=(int)(Math.random()*6)+1;
      if(dado1==dado2){
        iguales=true;
      }
      System.out.println(dado1+" "+dado2+" "+iguales);
  }
 }
}
