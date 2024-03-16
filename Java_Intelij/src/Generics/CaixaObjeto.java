package Generics;

public class CaixaObjeto {

    // Exemplo sem Generics

    private Object coisa; // Object -> tipo mais generico suportado no java
    public void guardar(Object coisa) {
        this.coisa = coisa;
    }
    public Object abrir() {
        return coisa;
    }

}
