package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		int n = 1;
		
		// ele precisa do break para parar no qual você deseja, se ficar sem ele pega o valor correspondente da variavel e junta com os demais + o default
		
		switch(n) {
		
		case 1:
			System.out.println("war");
		default:
			System.out.println("nao");
		}
		
	}
	
}
