package classe;

public class Data {

	
	int dia, mes, ano, hora, minuto, segundo;
	
	Data(int dia, int mes, int anoInicial, int hora, int minuto, int segundo) { // construtor, aqui você define as variaveis e o que vão ser atribuidas, mas coloque os dados no momento da instancia
		this.dia = dia;
		this.mes = mes;
		ano = anoInicial;
		
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	Data() { // padrão caso não tenha parametros dentro no momento da instancia
		
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		
		this(1, 1, 1970, 10, 15, 35); // para chamar outro construtor
		
		// Valores Padrões das Variaveis
		// byte, short, int, long -> 0
		// float, double -> 0.0
		// boolean -> false
		// char -> '\u0000'
		// Objetos -> Null
		// String -> Null
		
	}
	
	String obterDataFormatada() { 
		return String.format("%d/%d/%d %d:%d:%d", this.dia, this.mes, this.ano, this.hora, this.minuto, this.segundo);
	}
	
	void imprimirDataFormatada() { // nesse metodo não precisa colocar return pq já é void q não precisa retornar nada, ele só é usado para terminal então não é mt bom colocar em outras aplicações
		System.out.println(this.obterDataFormatada()); 
	}
	
}
