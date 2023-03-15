package exercicios;

public class TipoPrimitivo {

	public static void main(String[] args) {
		
		// informações de um funcionario
		
		// tipos numericos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// tipos numericos reais (com ponto)
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// tipo booleano
		
		boolean estaDeFerias = true;
		
		// tipo caractere 
		
		char status = 'S'; // ativo, usar aspas simples, simbolo, numero, apenas um caractere/numero ou unicode como \u0010
		
		// Dias de empresa
		
		System.out.println(anosDeEmpresa * 365 + " dias de empresa");
		
		// Numero de viagens
		
		System.out.println(numeroDeVoos / 2  + " viagens");
		
		// Pontos por Real
		
		System.out.println(pontosAcumulados / vendasAcumuladas + " Pontos ganhos");
		
		// id
		
		System.out.println("O funcionario: " + id + " Ganha: " + salario + " está de ferias? " + estaDeFerias + " está ativo? " + status);
		
	}
	
}
