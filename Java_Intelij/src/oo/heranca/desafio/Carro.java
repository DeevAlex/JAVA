package oo.heranca.desafio;

public class Carro {

    public final int VELOCIDADE_MAXIMA; // um valor constante, acaba por padrao se escreve o nome da variavel em letra maiuscula
    protected int velocidadeAtual = 0;

    private int velocidade = 5;

    protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void Acelerar() {
        if (velocidadeAtual + getVelocidade() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += getVelocidade();
        }
    }

    public void Frear() {
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        } else if (velocidadeAtual >= velocidade) {
            velocidadeAtual -= 5;
        }
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
