package Generics;

import java.util.List;

public class ListaUtil {

    public static Object getUltimo1(List<?> lista) { // a ? pode ser qualquer coisa e se for Object será que a lista é apenas de Object

        return lista.get(lista.size() - 1);

    }

    public static <T> T getUltimo2(List<T> lista) { // Colocamos o tipo da lista no tipo do metodo e do retorno do metodo, caso nao tenha o <T> na frente ali do static gerá erro

        return lista.get(lista.size() - 1);

    }

}
