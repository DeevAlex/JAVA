package exercicios;

public class ConversaoTipoPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1.170400908888888888; // conversão implicita
		System.out.println(a);
		
		float b = (float) 1.170400908888888888; // conversão explicita (CAST)
		System.out.println(b);
		
		int c = 512;
		byte d = (byte) c; // conversão explicita (CAST)
		System.out.println(d);
		
		double e = 1.999999999999;
		int f = (int) e;  // conversão explicita (CAST) e não arredonda
		System.out.println(f);
	}
	
}
