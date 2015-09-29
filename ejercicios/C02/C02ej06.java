//Carlos Jurado Moreno
public class C02ej06{
	public static void main(String[] args){
	double base= 100;
	int IVA = 21;
	double factura=0.0;
	
	factura=((base*IVA)/100)+base;
	
	System.out.println("Su factura con un "+IVA+"% de IVA, asciende a " +factura);
	}
}
