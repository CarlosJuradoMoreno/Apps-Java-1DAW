import java.util.*;
public class C10ej01{
	public static void main (String[] args){
		ArrayList<String> a= new ArrayList<String>();
		a.add("Perez");
		a.add("compi2");
		a.add("compi12");
		a.add("compi45");
		a.add("compi23");
		a.add("compi023");
		for(String s: a){
			System.out.println(s);
		}
	}
}