package exercicios;

public class Fundamentos {

	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "Bom dia X";
		
		s = s.toUpperCase();
		s = s.replace("X", "Senhor");
		s = s.concat(", Tudo bem?");
		
		System.out.println(s);
		
		String x = "Alex".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia".replace("dia", "Noite").toUpperCase().concat(", Alex").indent(1);
		System.out.println(y);
		
		// tipos primitivos não tem o operador o "."
		
		int g = 3;
		
		System.out.println(a);
		System.out.println(g);
		
	}
	
}
