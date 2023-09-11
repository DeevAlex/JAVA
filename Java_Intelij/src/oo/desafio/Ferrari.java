package oo.desafio;

public class Ferrari extends Carro {

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    // na hora de sobreescrever um metodo devemos manter a mesma visibilidade ou aumentar a visibilidade (nunca diminuir)
    @Override // só serve como uma validação que você está sobreescrevendo um metodo que existe na classe pai
    public void Acelerar() {
        if (velocidadeAtual >= super.VELOCIDADE_MAXIMA) {
            velocidadeAtual = super.VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += 15;
        }
    }

}
