/**
 *Escribe un programa que muestre tres apuestas de la quiniela en
 *tres columnas para los partidos y el pleno al quince (15 filas).
 *
 * @author Carlos Jurado Moreno
 */
 public class C06ej07{
  public static void main(String[] args){
  
  System.out.println("Apuestas1\tApuestas2\tApuestas3");
  for(int i=0;i<15;i++){
    for(int j=1;j<=3;j++){
      int quiniela=(int)(Math.random()*3);
      
      if(quiniela==0){
        System.out.print("X\t\t");
      }else{
        System.out.print(quiniela+"\t\t");
      }
    }  
    System.out.println("");
  }
  }
 }
