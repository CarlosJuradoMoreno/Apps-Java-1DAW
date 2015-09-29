//Carlos Jurado Moreno

public class C03ej07{
  public static void main(String[] args){
    double bruto;
    int IVA=21;
    double factura;
    
    System.out.println("Inserte la base imponible de la factura");
    bruto = Double.parseDouble(System.console().readLine());
    factura= ((bruto*21)/100)+bruto;
    System.out.printf("La factura es de %.4f €", factura);
    
  }
}
