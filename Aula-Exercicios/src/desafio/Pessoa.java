package desafio;

public class Pessoa {

	String pessoa;
	double peso;
	
	Pessoa() {
		
	}
	
	Pessoa(String pessoa, double peso) {
		this.pessoa = pessoa;
		this.peso = peso;
	}
	
	void Comer(Comida comida) {
		
		if (comida != null) {
			this.peso += comida.pesoComida;
		}
		
	}
	
	String apresentar() {
		return "Olá eu sou o " + pessoa + " e tenho " + peso + "Kgs";
	}
	
}
