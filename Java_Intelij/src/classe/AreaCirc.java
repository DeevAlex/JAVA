package classe;

public class AreaCirc {

	double raio;
	static final double pi = 3.14; // essa pertence a classe, e é uma constante
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
		// pi = Math.PI; se estiver em constante não pode existir essa
	}
	
	double area() { // metodo
		return Math.pow(raio, 2) * pi;
	}
	
}
