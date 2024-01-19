package Excecao.personalizadaB.personalizada;

public class NumeroForaDoIntervaloException extends Exception {

    private String nomeDoAtributo;
    public NumeroForaDoIntervaloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo '%s' está fora do intervalo", nomeDoAtributo);
    }
}
