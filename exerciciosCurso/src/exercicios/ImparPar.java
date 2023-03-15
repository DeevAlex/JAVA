package exercicios;

public class ImparPar {
	
	public static void main(String[] args) {
		
		double[] impar = {1,2,3,4,5,6,7,8,9,10};
		double[] par = {1,2,3,4,5,6,7,8,9,10};

		for(int i = 0; i < impar.length; i++) {
			if (impar[i] % 3 == 0) System.out.println(impar[i]);
		}

		for(int i = 0; i < par.length; i++) {
			if (impar[i] % 2 == 0) System.out.println(impar[i]);
		}
		
	}
}
