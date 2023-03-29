package classe;

import java.util.Date;

public class Equals {

	public static void main(String[] args) {
		
		// usando == para verificar os objetos vai dar false, pois são dois objetos distintos na memoria, ou seja, está comparando endereço de momoria
		// usando .equals também vai dar false
		
		Usuario u1 = new Usuario();
		u1.nome = "Klebin Suarez";
		u1.email = "KLSuarez.54@gmail.com";	
		
		Usuario u2 = new Usuario();
		u2.nome = "Klebin Suarez";
		u2.email = "KLSuarez.54@gmail.com";	
	
		System.out.println(u1 == u2); // false
		System.out.println(u1.equals(u2)); // false
		
		System.out.println(u1 == u1); // true
		System.out.println("esse " + u1.equals(new Date())); // true
		
	}
	
}
