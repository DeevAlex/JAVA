package operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		// trabalho na terça (V ou F) e na quinta (V ou F) 
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean checagem = (trabalho1 && trabalho2);
		System.out.println("Conseguiram os dois trabalhos? " + checagem + ", Comprar a televisao de 50 polegadas");
		
		boolean checagem2 = (trabalho1 && !trabalho2 || !trabalho1 && trabalho2);
		System.out.println("Conseguiram um doss trabalhos? " + checagem2 + ", Comprar a televisão de 32");
		
		boolean checagem3 = (!trabalho1 && !trabalho2);
		System.out.println("Conseguiram os dois trabalhos? " + checagem3 + ", Vão ficar em casa");
		
	}
	
}
