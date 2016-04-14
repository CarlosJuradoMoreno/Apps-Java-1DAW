
public class Gato {
	private String nombre;
	private int edad;
	private String raza;
	
	public Gato(){
		
	}
	
	public Gato(String nombre, int edad, String raza){
		this.nombre=nombre;
		this.edad=edad;
		this.raza=raza;
	}
	
	public void setNombre(String n){
		this.nombre=n;
	}
	public void setEdad(int n){
		this.edad=n;
	}
	public void setRaza(String n){
	this.raza=n;
}
	@Override
	public String toString(){
		return ("Nombre:" +nombre+"\nEdad: "+edad+"\nRaza: "+raza);
	}
}
