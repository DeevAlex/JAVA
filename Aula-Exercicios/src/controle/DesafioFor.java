package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		// usando numero
		String valor1 = "#";
		for (int i = 1; i <= 5; i++) {
			
			System.out.println(valor1);
			valor1 += "#";
			
		}
		
		
		// usando apenas caracteres
		for(String i = "#"; !i.equalsIgnoreCase("######"); i += "#") {
			System.out.println(i);
		}
		
	}
	
}
