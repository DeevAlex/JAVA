package Generics;

public class CaixaObjeto {

    private Object coisa; // Object -> tipo mais generico suportado no java
    public void aguardar(Object coisa) {
        this.coisa = coisa;
    }
    public Object abrir() {
        return coisa;
    }

}
