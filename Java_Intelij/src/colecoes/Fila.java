package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // offer e add -> Adicionam elementos na fila
        // Diferença:
        // .add() lançará uma exceção caso a fila esteja cheia.
        //.offer() retorna falso caso a fila esteja cheia.

        fila.add("Ana");
        fila.offer("Bia");
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        // peek pega o primeiro elemento da fila sem remove-lo, caso a fila esteja vazia ele retorna null
        System.out.println(fila.peek());
        // element pega o primeiro elemento da fila sem remove-lo, caso a fila esteja vazia ele lança uma exceção
        System.out.println(fila.element());

        // poll pega o primeiro elemento e o remove, caso a fila esteja vazia ele retorna null
        fila.poll();

        // poll pega o primeiro elemento e o remove, caso a fila esteja vazia ele lança uma exceção
        fila.remove();

        // fila.size(); tamanho da fila
        // fila.clear(); limpa a fila
        // fila.isEmpty(); verifica se a fila está vazia
        // fila.contains(...); verifica se a fila contém algo que está no parametro

        // pode ser usado o foreach
        for(String pessoas : fila) {
            System.out.println(pessoas);
        }

    }

}
