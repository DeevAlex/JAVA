package Aula_5;
import javax.swing.*;

public class TrabalhadoresEmpresa {
    //Armazenaremos os dados dos trabalhadores da empresa em um vetor:
    private Trabalhador trab[];
    private int N;
    
public static void main(String[] args) {
    TrabalhadoresEmpresa principal = new TrabalhadoresEmpresa();
}

public TrabalhadoresEmpresa () {
    // simulacaoLeituraDeDados() ;
    // mostraTrabalhadoresCadastrados();
    N = 7;
    trab = new Trabalhador[N];
    trab[0] = new Trabalhador("Julio", 2000f, 'M');
    trab[1] = new Trabalhador("Mariana", 1000, 'F');
    trab[2] = new Trabalhador("Renata", 800, 'F');
    trab[3] = new Trabalhador("Pedro", 1500f, 'M');
    trab[4] = new Trabalhador("Amilton", 6000f, 'M');
    trab[5] = new Trabalhador("Jorge", 2200f, 'M');
    trab[6] = new Trabalhador("Carlos", 3500f, 'M');

    quickSort(trab, 0, trab.length - 1);
    for (Trabalhador t : trab) {
        System.out.println(t.getNome() + ": " + t.getSalario());
    }
}
    public static void quickSort(Trabalhador[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particionar(arr, inicio, fim);
            quickSort(arr, inicio, pivo - 1);
            quickSort(arr, pivo + 1, fim);
        }
    }
    public static int compareSalariosDecrescente(Trabalhador a, Trabalhador b) {
        return Double.compare(b.getSalario(), a.getSalario());
    }
    public static int particionar(Trabalhador[] arr, int inicio, int fim) {
        Trabalhador pivo = arr[inicio];
        int i = inicio + 1;
        int j = fim;
        while (i <= j) {
            if (compareSalariosDecrescente(arr[i], pivo) <= 0) {
                i++;
            } else if (compareSalariosDecrescente(arr[j], pivo) > 0) {
                j--;
            } else {
                TrocaElementos(arr, i, j);
            }
        }
        TrocaElementos(arr, inicio, j);
        return j;
    }
    public static void TrocaElementos(Trabalhador[] arr, int i, int j) {
        Trabalhador temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
