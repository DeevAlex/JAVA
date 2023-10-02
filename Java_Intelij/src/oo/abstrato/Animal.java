package oo.abstrato;

public abstract class Animal { // a classe abstrata seria como ela estivesse inacabada e os metodos abstratos no momento não sabemos como generaliza-lo

    public String respirar() {
        return "Usando Oxigênio";
    }

    public abstract String mover();

}
