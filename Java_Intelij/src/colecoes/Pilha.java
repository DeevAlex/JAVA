package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Pilha {

    public static void main(String[] args) {
        Deque<String> pilhaLivros = new ArrayDeque<>();

        // add adiciona a pilha, caso não seja possivel adicionar ele retorna um valor booleano
        pilhaLivros.add("O Pequeno Principe");
        // push adiciona a pilha, caso não seja possivel adicionar ele lança uma exceção
        pilhaLivros.push("Don Quixote");
        pilhaLivros.push("O Hobbit");

        // no caso da pilha ele vai retornar/remover o ultimo que outrou
        // peek pega o primeiro elemento da pilha sem remove-lo, caso a pilha esteja vazia ele retorna null
        pilhaLivros.peek();

        // element pega o primeiro elemento da pilha sem remove-lo, caso a pilha esteja vazia ele lança uma exceção
        pilhaLivros.element();

        // poll pega o ultimo elemento e o remove, caso a pilha esteja vazia ele retorna null
        pilhaLivros.poll();

        // poll pega o ultimo elemento e o remove, caso a pilha esteja vazia ele lança uma exceção
        pilhaLivros.remove();

        // pop pega o ultimo elemento e o remove, caso a pilha esteja vazia ele lança uma exceção
        pilhaLivros.pop();

        // pilhaLivros.size(); tamanho da fila
        // pilhaLivros.clear(); limpa a fila
        // pilhaLivros.isEmpty(); verifica se a fila está vazia
        // pilhaLivros.contains(...); verifica se a fila contém algo que está no parametro

        // pode ser usado o Foreach
        for(String livros : pilhaLivros) {
            System.out.println(livros);
        }

    }

}
