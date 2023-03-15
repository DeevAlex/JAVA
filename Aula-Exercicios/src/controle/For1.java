package controle;

public class For1 {

	public static void main(String[] args) {
		
		// pode ser assim	
		for(int contador = 0; contador <= 50; contador++) {
			System.out.println(contador);
		}
		
		// o for é mais determinado do que o while
		
		// pode ser assim
		int x = 0;
		for(; x <= 5;) {
			System.out.println(x);
			x++;
		}
		
		
		// pode ser assim
		for(;;) {
			System.out.println("Infinito");
		}
		
	}
	
}
