package Generics;

// O tipo aqui do generics pode ser uma letra, como a letra T -> Type/Tipo, (V -> Value/Valor ou K -> Key/Chave) os entre parênteses é encontra do, por exemplo, no Dictionary<String, Double> e entre outros.
public class Caixa<TUPO_RECEBIDO> { // Esse TUPO_RECEBIDO é o tipo de dado que será recidbo, e coloca o tipo nesse TUPO_RECEBIDO é na hora da instância dessa classe

    private TUPO_RECEBIDO coisa; // Object -> tipo mais generico suportado no java
    public void guardar(TUPO_RECEBIDO coisa) {
        this.coisa = coisa;
    }
    public TUPO_RECEBIDO abrir() {
        return coisa;
    }

}
