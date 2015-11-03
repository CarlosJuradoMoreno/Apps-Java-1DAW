/**
 *Realiza una programa que calcule las horas transcurridas entre
 *dos horas de dos días de la semana. No se tendrán en cuenta los
 *minutos ni los segundos. El día de la semana se puede pedir como
 *un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”).
 *Se debe comprobar que el usuario introduce los datos correctamente
 *y que el segundo día es posterior al primero.
 *Ejemplo:
 *Por favor, introduzca la primera hora.
 *Día: lunes
 *Hora: 18
 *Por favor, introduzca la segunda hora.
 *Día: martes
 *Hora: 20
 *Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
 * 
 * @author Carlos Jurado Moreno
 */
 public class C05ej30{
  public static void main(String[] args){
    String leerDia1;
    int hora1;
    String leerDia2;
    int hora2;
    int dia1=0;
    int dia2=0;
    boolean falloEntrada=false;
  
    System.out.print("Inserte el primer dia: ");
    leerDia1=System.console().readLine().toLowerCase();
    System.out.print("Inserte la hora: ");
    hora1=Integer.parseInt(System.console().readLine());
    System.out.print("Inserte segundo dia: ");
    leerDia2=System.console().readLine().toLowerCase();
    System.out.print("Inserte la hora: ");
    hora2=Integer.parseInt(System.console().readLine());
  
  //entrada dia 1
    if((hora1<0||hora1>24)||(hora2<0||hora2>24)){
      falloEntrada=true;
    }
    
      switch (leerDia1){
        case "lunes":
        dia1=1;
        break;
        case "martes":
        dia1=2;
        break;
        case "miercoles":
        dia1=3;
        break;
        case "jueves":
        dia1=4;
        break;
        case "viernes":
        dia1=5;
        break;
        case "sabado":
        dia1=6;
        break;
        case "domingo":
        dia1=7;
        break;
        
        default:
        dia1=Integer.parseInt(leerDia1);
        if(dia1<1||dia1>7){
          falloEntrada=true;
      }
    }
    
            //Entrada dia 2
      switch (leerDia2){
        case "lunes":
        dia2=1;
        break;
        case "martes":
        dia2=2;
        break;
        case "miercoles":
        dia2=3;
        break;
        case "jueves":
        dia2=4;
        break;
        case "viernes":
        dia2=5;
        break;
        case "sabado":
        dia2=6;
        break;
        case "domingo":
        dia2=7;
        break;
        
        default:
        dia2=Integer.parseInt(leerDia2);
        if((dia2<1)||(dia2>7)){
          falloEntrada=true;
      }
   
    }
    if(!falloEntrada){
      if((dia1>dia2)||((dia1==dia2)&&(hora1>hora2))){
        System.out.println("Error, primera fecha es posterior a la segunda");
    
      
      }
      
       System.out.println("hay " + (((dia2 * 24) + hora2) - ((dia1 * 24) + hora1)) + " horas entre dia y dia.");
    }else{
      System.out.println("ERROR EN LA ENTRADA DE DATOS");
   }
  }
 }
