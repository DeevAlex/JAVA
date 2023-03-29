package controle;

public class BreakRotulado {

	public static void main(String[] args) {
		
		System.out.println(Math.floor(Math.random() * 100));
		
		externo: for(int i = 0; i < 3; i++) {
			
			interno: for(int j = 0; j < 3; j++) {
				
				if (i == 1) {
					break externo;
				}
				
				System.out.printf("%d %d ", i, j);
				
			}
			
			System.out.println();
			
		}
		System.out.println("Fim");
	}
	
}
