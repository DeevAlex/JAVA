package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(5.6);
		AreaCirc a1 = new AreaCirc(2);
		// a1.pi = 5;
		
		// AreaCirc.pi = 3.1415; // acessando direto da classe, nem essa
		
		System.out.println(a.area());
		System.out.println(a1.area());
		 
	}
	
}
