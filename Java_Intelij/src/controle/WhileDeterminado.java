package controle;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		int contador = 0;
		
		while(contador <= 1000) {
			System.out.println(contador);
			contador+=16;
			
			// contador+=16; de numero em numero tipo esse vai 16 em 16, [0 16 32 48 64 ...]
		}
		
	}
	
}
