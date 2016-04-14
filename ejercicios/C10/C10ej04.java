import java.util.*;
public class C10ej04{
	public static void main (String[] args){
		ArrayList<String> a= new ArrayList<String>();

		for(int i=0;i<10;i++){
			a.add(aleatorio());
		}
		Collections.sort(a);
		for(String s:a){
			System.out.println(s);
		}
	}

	public static String aleatorio(){
		String res="";
		int numero= ((int)(Math.random()*25)+97);
		res=((char)numero)+"";

		return res;
	}
}
