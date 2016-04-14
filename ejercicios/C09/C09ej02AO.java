import java.util.Scanner;

public class C09ej02AO {
	public static void main (String[] args){
		Gato[] gatos= new Gato[4];
		Scanner sc= new Scanner(System.in);
		String nombre, raza;
		int edad;
		for(int i=0;i<4;i++){
			
			System.out.println("Inserte nombre");
			nombre=sc.nextLine();
			System.out.println("Inserte Edad");
			edad=Integer.parseInt(sc.nextLine());
			System.out.println("Inserte Raza");
			raza=sc.nextLine();
			Gato g= new Gato(nombre, edad, raza);
			gatos[i]=g;
		}
		
		for(int i=0;i<4;i++){
			System.out.println(gatos[i].toString());
		}
	}
}
