package exercicios;

import java.io.Console;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
	Scanner e = new Scanner(System.in);
	double setavalores, auxH = 0, auxM = 0, realizaContaH = 0, realizaContaM = 0, qtdH = 0, i = 1, valoresHomens = 0, valoresMulheres = 0, qtdM = 0;
	String verificacao;
	
	System.out.println("Escreva a quantidade de pessoas no grupo: ");
	setavalores = e.nextInt();
	
	while(i <= setavalores) {
		
		System.out.println("Digite se é 'Homem' ou 'Mulher':");
		verificacao = e.next();
		
		if(verificacao.equalsIgnoreCase("Homem")) {
			System.out.println("Digite a estatura do " + verificacao + " desse grupo: ");
			valoresHomens = e.nextDouble();
			auxH += valoresHomens;
			qtdH++;
		} else if (verificacao.equalsIgnoreCase("Mulher")){
			System.out.println("Digite a estatura do " + verificacao + " desse grupo: ");
			valoresMulheres = e.nextDouble();
			auxM += valoresMulheres;
			qtdM++;
		} else {
			System.out.println("Houve um Erro: Digite 'Homem' ou 'Mulher'");
			return;
		}
		
		realizaContaH = auxH / qtdH;
		realizaContaM = auxM / qtdM;
		
		i++;
		
	}
	
	System.out.printf("A estatura média %.2f dos homem(ns), A estatura média %.2f das mulher(es) e Possuí %.1f Homem(ns) e Possuí %.1f Mulher(es)", realizaContaH, realizaContaM, qtdH, qtdM);
		
	}
	
}
