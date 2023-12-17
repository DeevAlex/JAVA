package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

//        Scanner e = new Scanner(System.in);
//
//        System.out.println("Digite quantos numeros você quer adicionar");
//        int qtdNumeros = e.nextInt();
//
//        String[] parcela1 = new String[qtdNumeros];
//        StringBuilder numeros = new StringBuilder();
//        StringBuilder numeros2 = new StringBuilder();
//
//        for (int i = 0; i < qtdNumeros; i++) {
//
//            System.out.println("Digite um numero: ");
//            parcela1[i] = e.next();
//            numeros2.append(parcela1[i] + " ");
//
//        }
//
//
//        for (int j = parcela1.length - 1; j >= 0; j--) {
//
//            numeros.append(parcela1[j] + " ");
//
//        }
//
//        System.out.println("Ordem Normal: " + numeros);
//        System.out.println("Ordem Invertida: " + numeros2);


        String[] nome = {"123", "234", "345"};
        System.out.println("Vetor normal: " + Arrays.toString(nome));

        // invertendo a ordem de cada elemento do vetor
        String nomes = "";
        for (int j = 0; j < nome.length; j++) {
            for (int i = nome[j].split("").length - 1; i >= 0; i--) {
                nomes += nome[j].split("")[i];
            }
            nomes += " ";
        }
        System.out.print("Caracteres Invertidos: " + nomes);

        // inverte a ordem do vetor
        String nomes1 = "";
        for (int i = nome.length - 1; i >= 0; i--) {
            nomes1 += nome[i] + " ";
        }

        System.out.println("\nVetor Invertido: " + nomes1);

    }

}
