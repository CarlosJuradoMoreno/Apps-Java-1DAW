import java.util.*;
public class C10ej03{
	public static void main (String[] args){
		ArrayList<Integer> a= new ArrayList<Integer>();
		int tam = 10;

		for(int i=0;i<tam;i++){
			a.add(((int)(Math.random()*100)));
		}
		Collections.sort(a);
		for(int s: a){
			System.out.println(s);
		}
	}

}
	

