package Aula_4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numeros = {4, 2, 10, 123, -3, 32, 0, 34, 12, 91, 45, 3, 21, 87, 61};
        String[] paises = {"México", "Brasil", "Cuba", "Chile", "Argentina", "Espanha"};

        SelectionSort(numeros);
        bubbleSort(paises);

    }

    public static void SelectionSort(int vetor[]) {
        if (vetor == null || vetor.length < 2) return;
        for (int i = 0; i < vetor.length - 1; i++) {
            int posMaior = i;
            int maior = vetor[i];
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] > maior) { // ao alterar o sinal maior ou menor que, ele começa a ordernar, maior que ele ordena de menor para maior e vice-versa
                    posMaior = j;
                    maior = vetor[j];
                }
            }
            int temp = vetor[i];
            vetor[i] = maior;
            vetor[posMaior] = temp;
        }
        System.out.println(Arrays.toString(vetor));
    }

    public static void bubbleSort(String vetor[]) {
        if (vetor == null || vetor.length < 2) return;
        int size = vetor.length;
        for(int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if(vetor[i].compareTo(vetor[j]) > 0) {
                    String temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(vetor));
    }


}

