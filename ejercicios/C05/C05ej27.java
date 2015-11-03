/**
 *Escribe un programa que muestre, cuente y sume los  múltiplos de 3 que hay entre 1 y un
 *número leído por teclado.
 * 
 * @author Carlos Jurado Moreno
 */
 public class C05ej27{
    public static void main(String[] args){
        int numero;
        int cantidad=0;
        int sumaTotal=0;
        
        System.out.print("Inserte el numero hasta el que quiera llegar: ");
        numero=Integer.parseInt(System.console().readLine());
        
        for(int i=1;i<=numero;i++){
            if((i%3)==0){
            sumaTotal+=i;
            cantidad++;
            System.out.print(i+" ");
            }
        }
        System.out.print("\nSuma un total de "+sumaTotal+" y tiene "+cantidad+" multiplos");
    }
 }
