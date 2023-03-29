package exercicios;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		Integer num1 = 100000; // usando variaveis wrappers
		System.out.println(num1.toString()); // .length());
		
		int num2 = 100000; // usando variaveis primitivas
		System.out.println(Integer.toString(num2).length());
		
		System.out.println(("" + num2).length());
		
	}
	
}
