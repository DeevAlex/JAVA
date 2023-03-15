package classe;

public class DataTeste {

	public static void main(String[] args) {
			
		Data data = new Data();
		Data data2 = new Data();
		data2.ano = 2016;
		Data data3 = new Data(21, 10, 2022, 21, 15, 10);
		
		
		
		// data.dia = 19;
		// data.mes = 10;
		// data.ano = 2022;
		// data.hora = 15;
		// data.minutos = 23;
		// data.segundos = 00;
		
		
		
		System.out.printf(data.obterDataFormatada());
		System.out.println();
		System.out.println(data2.obterDataFormatada()); // aq está chamando 
		System.out.println(data3.obterDataFormatada());
		data.imprimirDataFormatada();
		
		double a = Math.PI;
		
	}

	
}
