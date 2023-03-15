package exercicios;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		double base, altura, baseMaior, baseMenor, h, lado, diagonalMaior, diagonalMenor, area, pi = 3.14, raio; 
	    int escolha;
	    
	    String resp = "";
	    while(!resp.equalsIgnoreCase("Nao")) {
		   System.out.println("Escolha um calculo: (1) Retangulo (2) Quadrado (3) Losango (4) Trapezio (5) Paralelogramo (6) Triangulo (7) Circulo");
		    escolha = e.nextInt();
		    
		    switch(escolha) {
	    	case 1:
	    		System.out.println("Digite a base");
	    		base = e.nextDouble();
	    		System.out.println("Digite a altura");
	    		altura = e.nextDouble();
	    		area = base * altura;
	    		System.out.println("Area do Retangulo: " + area);
	    		System.out.println("Deseja continuar? (Sim) ou (Nao)");
	    		resp = e.next();
	    		break;
	    	case 2:
	    		System.out.println("Digite o tamanho do lado");
	    		lado = e.nextDouble();
	    		area = Math.pow(lado, 2);
	    		System.out.println("Area do Quadro: " + area);
	    		System.out.println("Deseja continuar? (Sim) ou (Nao)");
	    		resp = e.next();
	    		break;
	    	case 3:
	    		System.out.println("Digite a diagonal maior");
	    		diagonalMaior = e.nextDouble();
	    		System.out.println("Digite a diagonal menor");
	    		diagonalMenor = e.nextDouble();
	    		area = (diagonalMaior * diagonalMenor) / 2;
	    		System.out.println("Area do losango: " + area);
	    		System.out.println("Deseja continuar? (Sim) ou (Nao)");
	    		resp = e.next();
	    		break;
	    	case 4:
	    		System.out.println("Digite a base Maior");
	    		baseMaior = e.nextDouble();
	    		System.out.println("Digite a base menor");
	    		baseMenor = e.nextDouble();
	    		System.out.println("Digite a altura");
	    		h = e.nextDouble();
	    		area = (baseMaior + baseMenor) * h / 2;
	    		System.out.println("Area do Trapézio: " + area);
	    		System.out.println("Deseja continuar? (Sim) ou (Nao)");
	    		resp = e.next();
	    		break;
	    	case 5:
	    		System.out.println("Digite a base Maior");
	    		altura = e.nextDouble();
	    		System.out.println("Digite a base menor");
	    		base = e.nextDouble();
	    		area = base * altura;
	    		System.out.println("Area do Paralelogramo: " + area);
	    		System.out.println("Deseja continuar? (Sim) ou (Nao)");
	    		resp = e.next();
	    		break;
	    	case 6:
	    		System.out.println("Digite a base Maior");
	    		base = e.nextDouble();
	    		System.out.println("Digite a base menor");
	    		altura = e.nextDouble();
	    		area = (base * altura) / 2;
	    		System.out.println("Area do Triangulo: " + area);
	    		System.out.println("Deseja continuar? (Sim) ou (Nao)");
	    		resp = e.next();
	    		break;
	    	case 7:
	    		System.out.println("Digite o raio");
	    		raio = e.nextDouble();
	    		area = pi * Math.pow(raio, 2);
	    		System.out.println("Area do Circulo: " + area);
	    		System.out.println("Deseja continuar? (Sim) ou (Nao)");
	    		resp = e.next();
	    		break;
	    	default: 
	    		System.out.println("Escolha uma das opções");
	    		break;
		    }
	    }
	}

}