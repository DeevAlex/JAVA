package desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Alex", 66.1);
		Comida c = new Comida("Hamburger", 0.130);
		Comida c2 = new Comida("Salada de Frutas", 0.13);
		
		System.out.println(p.apresentar());
		p.Comer(c);
		System.out.println(p.apresentar());
		p.Comer(c2);
		System.out.println(p.apresentar());
		
	}
	
}
