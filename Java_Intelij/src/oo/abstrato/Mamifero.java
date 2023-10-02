package oo.abstrato;

public abstract class Mamifero extends Animal {

    @Override
    public final String mover() { // metodo concreto, sendo final não pode ser sobre-escrito
        return "Saindo do lugar";
    }

    public abstract String mamar(); // metodo abstrato

}


