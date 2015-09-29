//Carlos Jurado Moreno
public class C04ej01{
  public static void main(String[] args){
    String dia;
    String clase="null";
    System.out.println("Inserte un dia de la semana (sin tildes y minusculas)");
    dia=System.console().readLine();
    switch(dia){
    
      case "lunes":
      clase="FOL";
      break;
      
      case "martes":
      clase="Programacion";
      break;
      
      case "miercoles":
      clase="SINF";
      break;
      
      case "jueves":
      clase="PROGRAMACION";
      break;
      
      case "viernes":
      clase="BBDD";
      break;
      
      case "sabado":
      clase="No hay clase";
      break;
      
      case "domingo":
      clase="No hay clase";
      break;
    }
    if (clase=="null"){
      clase="Introduce un dia valido";
    }
    System.out.println(clase);
  }
}
