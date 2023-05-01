package colecoes;

import java.util.Objects;

public class Usuario {


    Usuario(String nome) {
        this.nome = nome;
    }

    String nome;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return this.nome.length();
    }

    //    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
//        return result;
//    }
//
//    public boolean equals(Object obj) {
//        Usuario outroUsuario = (Usuario) obj;
//        return this.nome.equals(outroUsuario.nome)
//    }
//
//    @Override
//    public int hashCode() {
//        return 0;
//    }

    public String toString() {
        return "Meu nome é " + this.nome;
    }
}