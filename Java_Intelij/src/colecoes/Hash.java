package colecoes;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Alberto"));

        System.out.println(usuarios.contains(new Usuario("Alberto")));

        // importante implementar o hashCode e o equals

    }

}
