/**
 * 2. Realiza un programa que muestre al azar el nombre de una carta de
 *    la baraja francesa. Esta baraja está dividida en cuatro palos: picas,
 *    corazones, diamantes y tréboles. Cada palo está formado por 13 cartas,
 *    de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7,
 *    8, 9, 10, J, Q, K y A (que sería el 1). Para convertir un número en
 *    una cadena de caracteres podemos usar String.valueOf(n).
 * 
 * @author Carlos Jurado Moreno
 */
 public class C06ej02{
  public static void main(String[] args){
    int palo=(int)(Math.random()*4)+1;
    int carta=(int)(Math.random()*13)+1;
    String salidaPalo="";
    String salidaCarta="";
    switch (palo){
      case 1: 
      salidaPalo="Picas";
      break;
      case 2:
      salidaPalo="Corazones";
      break;
      case 3:
      salidaPalo="Diamantes";
      break;
      case 4:
      salidaPalo="Treboles";
      break;
    }
    
    switch (carta){
      case 1:
      salidaCarta="As";
      break;
      case 11:
      salidaCarta="J";
      break;
      case 12:
      salidaCarta="Q";
      break;
      case 13:
      salidaCarta="K";
      break;
      default:
      salidaCarta=String.valueOf(carta);
    }
    System.out.print(salidaCarta+" de "+salidaPalo);
  }
 }
