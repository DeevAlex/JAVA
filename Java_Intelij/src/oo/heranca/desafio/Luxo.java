package oo.heranca.desafio;

public interface Luxo {

    public void ligarAr();
    abstract void desligarAr();
    default int velocidadeDoAr() { // valor padrão do metodo da interface, usado para não forçar a implementação
        return 1;
    }

}
