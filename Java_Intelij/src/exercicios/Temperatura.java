package exercicios;

public class Temperatura {

	public static void main(String[] args) {
		
		double temperaturaF = 120;
		final double const1 = 32;
		final double div = 5 / 9.0;
		double conversao = (temperaturaF - const1) * (div);
		double temperaturaC = conversao;
		
		System.out.println("A conversão de Firenhiet para celsius resultou em: " + temperaturaC + "°C");
		
	}
	
}
