package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // aqui é uma atribuição por valor (tipo primitivo)
		
		a++;
		b--;
		
		System.out.println("Exemplo: " + a + " " + b);
		
		int c = 5;
		
		alteraPrimitivo(c);
		System.out.println(c);
		
		
		Data d1 = new Data(18, 11, 2022, 15, 30, 15);
		Data d2 = d1; // aqui é uma atrubuição por referência (objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1; 
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alteraPrimitivo(int a) {
		a++;
	}
	
}
