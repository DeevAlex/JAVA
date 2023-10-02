package oo.heranca.desafio;

// interfaces - ela vai ter metodos e esses metodos não podem ter corpo, ela so inclui a necessidade de você implementar algo quando uma classe herda de uma interface
// uma classe em relação a interface pode herdar de multiplas interfaces
public interface Esportivo {

    // podemos usar interfaces para servir para você definir que algo tem aquele metodo, mas você ainda não tem ainda como implementar
    public abstract void ligarTurbo(); // todos os metodos na interface são public (não pode reduzir a visibilidade) e ele é abstract (é metodo que não tem corpo)
    void desligarTurbo();

}
