package exercicios;

public class Curso {

	String nomeCurso;
	int numeroInscritos;
	boolean possuiInscritos;
	boolean matriculado;
	
	boolean PossuiMatricula() {
		
		if (matriculado) {
			return matriculado;
		} else {
			return false;
		}

	}
	
	
}
