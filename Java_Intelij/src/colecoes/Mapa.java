package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        // o metodo put ele faz duas coisas, tanto adiciona se não existir, como ele vai substituir caso já exista
        usuarios.put(1, "Alberto");
        usuarios.put(2, "Adalberto");
        usuarios.put(3, "Vanessa");
        usuarios.put(4, "Rebeca");

        usuarios.size();
        usuarios.isEmpty();

        // retorna todas as chaves, ele ordena do jeito que foi colocado
        usuarios.keySet();
        // retorna todos os valores
        usuarios.values();
        // retorna a chave=valor
        usuarios.entrySet();

        // retorna um valor boolean caso contenha a chave
        usuarios.containsKey(1);
        // retorna um valor boolean caso contenha o valor
        usuarios.containsValue("Alberto");
        // retorna o valor que está na chave
        usuarios.get(4);
        // remove o valor, e retorna o valor removido
        usuarios.remove(1);
        // remove o valor, e retorna um valor boolean
        usuarios.remove(4, "Gui");

        // percorrendo as chaves
        for(int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        // percorrendo as valores
        for(String valor : usuarios.values()) {
            System.out.println(valor);
        }

        // percorrendo as chaves e os valores
        for(Map.Entry<Integer, String> registro : usuarios.entrySet()) {
            // pega apenas a chave: System.out.println(registro.getKey());
            // pega apenas o valor: System.out.println(registro.getValue());
            System.out.println(registro);
        }

    }

}
