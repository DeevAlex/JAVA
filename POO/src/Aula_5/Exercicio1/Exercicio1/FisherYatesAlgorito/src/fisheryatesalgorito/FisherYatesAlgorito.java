
package fisheryatesalgorito;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Mister Ronald
 */
import java.util.ArrayList;
import java.util.Random;

public class FisherYatesAlgorito {

    public static void main(String[] args) {
        double[] vetor = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 };
        aleatorizarVetor(vetor);
        
        for (double elem : vetor) {
            System.out.print(elem + " ");
        }
    }

    public static void aleatorizarVetor(double[] vet) {
        ArrayList<Double> list = new ArrayList<Double>();
        Random rand = new Random();
        
        // Adiciona os elementos do vetor na lista
        for (int i = 0; i < vet.length; i++) {
            list.add(vet[i]);
        }
        
        // Aplica o algoritmo de Fisher-Yates para aleatorizar a lista
        for (int i = list.size() - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            double temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
        
        // Copia os elementos aleatorizados da lista de volta para o vetor
        for (int i = 0; i < list.size(); i++) {
            vet[i] = list.get(i);
        }
    }

}
