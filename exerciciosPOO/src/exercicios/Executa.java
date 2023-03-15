package exercicios;

public class Executa {

	public static void main(String[] args) {
		
		// Classe Cliente Instanciada
		Cliente cliente01 = new Cliente();
		
		// Classe Cliente Instanciada
		Curso curso01 = new Curso();
		
		cliente01.nome = "Alex";
		cliente01.idade = 18;
		cliente01.desconto = true;
		System.out.printf("Nome do Cliente: %s\n", cliente01.nome);
		System.out.printf("Idade do Cliente: %d\n", cliente01.idade);
		System.out.printf("Cliente Possuí Desconto: %b\n", cliente01.PossuiDesconto());
		
		System.out.println("----------------------------------------");
		
		curso01.nomeCurso = "Aprendendo POO na pratica";
		curso01.numeroInscritos = 154_000;
		curso01.possuiInscritos = true;
		curso01.matriculado = true;
		
		System.out.printf("Curso: %s\n", curso01.nomeCurso);
		System.out.printf("Numero de Alunos: %d\n", curso01.numeroInscritos);
		System.out.printf("Possui Alunos: %b\n", curso01.possuiInscritos);
		System.out.printf("Aluno Matriculado: %b", curso01.PossuiMatricula());
		
	}
	
}
