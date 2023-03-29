package classe;

public class PrimeiroTrauma {

	int a = 3; // não pode mexer
	static int b = 4;
	
	public static void main(String[] args) {
		
		// algo statico consegue acessar um membro statico superior
		
		// PrimeiroTrauma p = new PrimeiroTrauma(); pode ser assim
		// System.out.println(p.a);
		
		// static int b = 4; colocando assim
		System.out.println(b);
		
		//
		System.out.println();
		
	}
	
}
