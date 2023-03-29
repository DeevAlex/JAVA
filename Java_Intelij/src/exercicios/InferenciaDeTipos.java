package exercicios;

public class InferenciaDeTipos {

	public static void main(String[] args) {
		
		double a = 1.5; // declaração e inicialização
		
		System.out.println(a);
		
		a = 12; // aq ele amarrou o tipo que foi setado anteriormente, pode ser inteiro ou quebrado se colocar uma string ele deixa de funcionar
		
		System.out.println(a);
		
//		a = "...";
		
		var b = 4.5;
		
		System.out.println(b);
		
		var c = "Texto";
		
		System.out.println(c);
		
		c = "Outro texto";
		
		System.out.println(c);
		
//		c = 4.5;
		
		double d; // variavel foi declarada 
		
		d = 123.65; // aqui a variavel foi inicializada
		
		System.out.println(d); // aqui a variavel foi usada
		
		var e = 123.45; // utilizando o var tem que ser declarada e iniciada
		
		System.out.println(e);
		
		var f = 12; // aqui tem q continuar inteiro, pois o java não recebe numeros quebrados
		// f = 12.01;
		
		System.out.println(f);
		
	}
	
}
