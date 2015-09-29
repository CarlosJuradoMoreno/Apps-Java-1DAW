public class c01ej05{
	public static void main(String[] args){
		String fol= "\033[31m"+"FOL";
		String prog= "\033[32m"+"PROG";
		String sin= "\033[33m"+"SIN";
		String bbdd= "\033[34m"+"BBDD";
		String ed= "\033[35m"+"ED";
		String lm= "\033[36m"+ "LM";

		System.out.println("Lunes\tMartes\tMiercoles\tJueves\tViernes");
		System.out.println(fol+"\t"+prog+"\t"+sin+"\t\t"+prog+"\t"+bbdd);
		System.out.println(fol+"\t"+prog+"\t"+sin+"\t\t"+prog+"\t"+bbdd);
		System.out.println(fol+"\t"+prog+"\t"+sin+"\t\t"+prog+"\t"+bbdd);
		System.out.println(prog+"\t"+bbdd+"\t"+sin+"\t\t"+ed+"\t"+prog);
		System.out.println(ed+"\t"+bbdd+"\t"+lm+"\t\t"+lm+"\t"+sin);
		System.out.println(ed+"\t"+bbdd+"\t"+lm+"\t\t"+lm+"\t"+sin);
	}
}
