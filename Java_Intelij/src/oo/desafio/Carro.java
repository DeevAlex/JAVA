package oo.desafio;

public class Carro {

    public final int VELOCIDADE_MAXIMA; // um valor constante, acaba por padrao se escreve o nome da variavel em letra maiuscula
    protected int velocidadeAtual = 0;

    protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void Acelerar() {
        if (velocidadeAtual + 5 > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += 5;
        }
    }

    public void Frear() {
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        } else if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        }
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}
