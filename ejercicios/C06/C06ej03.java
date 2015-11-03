/**
 *Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de
 *48 cartas: 2, 3, 4, 5, 6, 7, 8, 9, sota, caballo, rey y as.
 *
 * @author Carlos Jurado Moreno
 */
 public class C06ej03{
  public static void main (String[] args){
    int palo=(int)(Math.random()*4)+1;
    int carta=(int)(Math.random()*10)+1;
    String salidaPalo="";
    String salidaCarta="";
    switch (palo){
      case 1: 
      salidaPalo="Bastos";
      break;
      case 2:
      salidaPalo="Espadas";
      break;
      case 3:
      salidaPalo="Copas";
      break;
      case 4:
      salidaPalo="Oros";
      break;
    }
    
    switch (carta){
      case 1:
      salidaCarta="As";
      break;
      case 8:
      salidaCarta="Sota";
      break;
      case 9:
      salidaCarta="Caballo";
      break;
      case 10:
      salidaCarta="Rey";
      break;
      default:
      salidaCarta=String.valueOf(carta);
    }
    System.out.print(salidaCarta+" de "+salidaPalo);
  }
 }
