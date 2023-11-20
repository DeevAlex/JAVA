package colecoes;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        // declarando um array dinamico do tipo Usuario
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");

        lista.add(u1); // 0
        lista.add(new Usuario("Carlos")); // 1
        lista.add(new Usuario("Lia")); // 2
        lista.add(new Usuario("Bia")); // 3
        lista.add(new Usuario("Manu")); // 4

        System.out.println(lista.get(3).nome); // acessando pelo indice e exibindo o nome

        lista.remove(1); // removendo pelo indice, caso removido retorna o objeto
        lista.remove(new Usuario("Manu")); // removendo pelo objeto, caso removido retorna um boolean

        lista.contains(3); // verifica com o indice, e retorna um boolean
        lista.contains(new Usuario("Lia")); // verifica com o objeto, e retorna um boolean

        // pode ser usado o Foreach
        for(Usuario u : lista) {
            System.out.println(u.toString() + " " + lista.indexOf(u));
        }


    }

}
