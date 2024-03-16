package Generics;

import java.util.*;

public class Pares<C extends Number, V> {

    private final Set<Par<C, V>> itens = new LinkedHashSet<>(); // se usarmos TreeSet precisa de um Comparable porque é ele quem garante como os dados serão ordenados o LinkedHashSet garante a ordenação pela ordem de inclusão

    public void Adicionar(C chave, V valor) {

        if (chave == null) return;

        Par<C, V> novoPar = new Par<C, V>(chave, valor);

        if (itens.contains(novoPar)) {
            itens.remove(novoPar);
        }

        itens.add(novoPar);
    }

    public V getValor(C chave) {

        if (chave == null) return null;

        Optional<Par<C, V>> parOptional = itens.stream().filter(v -> chave.equals(v.getChave())).findFirst();

        return parOptional.isPresent() ? parOptional.get().getValor() : null;
    }
}
