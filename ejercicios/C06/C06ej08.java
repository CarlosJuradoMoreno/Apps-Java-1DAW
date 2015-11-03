/**
 *Modifica el programa anterior para que la probabilidad de que salga un "1" sea de 1/2,
 *la probabilidad de que salga "x" sea de 1/3 y la probabilidad de que salga "2" sea de 1/6.
 *Nótese que 1/2 = 3/6 y 1/3 = 2/6.
 *
 * @author Carlos Jurado Moreno
 */
 public class C06ej08{
  public static void main(String[] args){
    
    System.out.println("Apuestas1\tApuestas2\tApuestas3");
  for(int i=0;i<15;i++){
    for(int j=1;j<=3;j++){
      int quiniela=(int)(Math.random()*6)+1;
      switch (quiniela){
        case 1:
        case 2:
        case 3:
        quiniela=1;
        break;
        case 4:
        case 5:
        quiniela=0;
        break;
        case 6:
        quiniela=2;
        break;
      }
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
