package oo.composicao.relacionamentoUmParaUm;

public class Motor {

    double fatorInjecao = 1;
    boolean ligado = false;
    final Carro carro; // Bidirecional

    Motor(Carro carro) { // Bidirecional
        this.carro = carro;
    }

    int giros() {

        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000); // convertendo
            // return (int) fatorInjecao * 3000; // casting
        }
    }

}
