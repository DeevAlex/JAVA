package exercicios;

import java.util.Scanner;

public class ExercicioFacul {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		//int num;
		//System.out.println("Digite um numero: ");
		//num = e.nextInt();
	    // int multiplo = 7;

	    // if (num % multiplo == 0) {
	    	// System.out.printf("numero %d é multiplo de 7", num);
	    // } else {
	    	// System.out.printf("numero %d não é multiplo de 7", num);
	    // }
	    
		//////////////////////////
		
	    //double base, altura, baseMaior, baseMenor, h, lado, diagonalMaior, diagonalMenor, area, pi = 3.14, raio; 
	    //int escolha;
	    
	    //String resp = "";
	   //while(!resp.equalsIgnoreCase("Não")) {
		   //System.out.println("Escolha um calculo: (1) Retangulo (2) Quadrado (3) Losango (4) Trapezio (5) Paralelogramo (6) Triangulo (7) Circulo");
		    //escolha = e.nextInt();
		    
		    //switch(escolha) {
	    	//case 1:
	    		//System.out.println("Digite a base");
	    		//base = e.nextDouble();
	    		//System.out.println("Digite a altura");
	    		//altura = e.nextDouble();
	    		//area = base * altura;
	    		//System.out.println("Area do Retangulo: " + area);
	    		//resp = e.next();
	    		//break;
	    	//case 2:
	    		//System.out.println("Digite o tamanho do lado");
	    		//lado = e.nextDouble();
	    		//area = Math.pow(lado, 2);
	    		//System.out.println("Area do Quadro: " + area);
	    		//System.out.println("Deseja continuar? (Sim) ou (Não)");
	    		//resp = e.next();
	    		//break;
	    	//case 3:
	    		//System.out.println("Digite a diagonal maior");
	    		//diagonalMaior = e.nextDouble();
	    		//System.out.println("Digite a diagonal menor");
	    		//diagonalMenor = e.nextDouble();
	    		//area = (diagonalMaior * diagonalMenor) / 2;
	    		//System.out.println("Area do losango: " + area);
	    		//System.out.println("Deseja continuar? (Sim) ou (Não)");
	    		//resp = e.next();
	    		//break;
	    	//case 4:
	    		//System.out.println("Digite a base Maior");
	    		//baseMaior = e.nextDouble();
	    		//System.out.println("Digite a base menor");
	    		//baseMenor = e.nextDouble();
	    		//System.out.println("Digite a altura");
	    		//h = e.nextDouble();
	    		//area = (baseMaior + baseMenor) * h / 2;
	    		//System.out.println("Area do Trapézio: " + area);
	    		//System.out.println("Deseja continuar? (Sim) ou (Não)");
	    		//resp = e.next();
	    		//break;
	    	//case 5:
	    		//System.out.println("Digite a base Maior");
	    		//altura = e.nextDouble();
	    		//System.out.println("Digite a base menor");
	    		//base = e.nextDouble();
	    		//area = base * altura;
	    		//System.out.println("Area do Paralelogramo: " + area);
	    		//System.out.println("Deseja continuar? (Sim) ou (Não)");
	    		//resp = e.next();
	    		//break;
	    	//case 6:
	    		//System.out.println("Digite a base Maior");
	    		//base = e.nextDouble();
	    		//System.out.println("Digite a base menor");
	    		//altura = e.nextDouble();
	    		//area = (base * altura) / 2;
	    		//System.out.println("Area do Triangulo: " + area);
	    		//System.out.println("Deseja continuar? (Sim) ou (Não)");
	    		//resp = e.next();
	    		//break;
	    	//case 7:
	    		//System.out.println("Digite o raio");
	    		//raio = e.nextDouble();
	    		//area = pi * Math.pow(raio, 2);
	    		//System.out.println("Area do Circulo: " + area);
	    		//System.out.println("Deseja continuar? (Sim) ou (Não)");
	    		//resp = e.next();
	    		//break;
		
		
		
		String resp = "";
		int aux = 0, numero, aux2 = 0;
		while(!resp.equalsIgnoreCase("Não")) {
			System.out.println("Digite um numero");
			numero = e.nextInt();
			aux += numero;
			aux2++;
			System.out.println("Deseja continuar? (Sim) ou (Não)");
			resp = e.next();
		}
		
		System.out.println(aux / aux2);
		
		
		
		    }
	   
	}


