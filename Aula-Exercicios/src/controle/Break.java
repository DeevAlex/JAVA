package controle;

import java.util.Iterator;

public class Break {
	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.println(i);
			
			if (i == 5) {
				break; // sem o if aq ele ia até o 10
			}
			
		}
		
		System.out.println("Fim");
		
	}
}
