package operadores;

public class Ternários {

	public static void main(String[] args) {
		
		double media = 7;
		
		// String resultado = media >= 7.0 ? "Aprovado" : media >= 5 ? "Reperacao" : "Reprovado"; Assim
		String resultado = media >= 7 ? "APROVADO" : "REPROVADO"; // ou Assim
		
		System.out.println("O aluno está: " + resultado);
		
	}
	
}
