package oo.desafio;

public class Ferrari extends Carro {

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override // só serve como uma validação que você está sobreescrevendo um metodo que existe na classe pai
    void Acelerar() {
        if (velocidadeAtual >= super.VELOCIDADE_MAXIMA) {
            velocidadeAtual = super.VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += 15;
        }
    }

}
