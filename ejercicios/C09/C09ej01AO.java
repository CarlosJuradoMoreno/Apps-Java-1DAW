import java.util.Scanner;

public class C09ej01AO {
	public static void main (String[] args){
		Gato[] gatos= new Gato[4];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<4;i++){
			Gato g= new Gato();
			System.out.println("Inserte nombre");
			g.setNombre(sc.nextLine());
			System.out.println("Inserte Edad");
			g.setEdad(Integer.parseInt(sc.nextLine()));
			System.out.println("Inserte Raza");
			g.setRaza(sc.nextLine());
			gatos[i]=g;
		}
		
		for(int i=0;i<4;i++){
			System.out.println(gatos[i].toString());
		}
	}
}
