/**
 * ucles
 * 
 * Escribe un programa que lea una lista de diez números y determine
 * cuántos son positivos, y cuántos son negativos.
 * 
 * @author Carlos Jurado Moreno
 */
 public class C05ej13{
   public static void main(String[] args){
     double numero;
     int positivo=0;
     int negativo=0;
     
     for(int i =1; i<=10;i++){
       System.out.print("Inserte el "+i+"º numero: ");
       numero=Double.parseDouble(System.console().readLine());
       
       if(numero>=0){
         positivo++;
      
       }else{
         negativo++;
       }
     }
    System.out.println("De la lista de numeros "+positivo+" son positivos "+negativo+" son negativos");
   }
 }
