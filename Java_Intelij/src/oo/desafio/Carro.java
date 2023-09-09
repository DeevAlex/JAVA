package oo.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA; // um valor constante, acaba por padrao se escreve o nome da variavel em letra maiuscula
    int velocidadeAtual = 0;

    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void Acelerar() {
        if (velocidadeAtual + 5 > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += 5;
        }
    }

    void Frear() {
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        } else if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        }
    }
    
}
