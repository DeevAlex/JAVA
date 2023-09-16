package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class ClasseTeste {
// podemos alterar o nivel de visibilidade da classe para package e public, de resto da erro

    public static void main(String[] args) {

        Civic civic = new Civic();

        civic.Acelerar();
        System.out.println("Velocidade Atual do Civic: " + civic.getVelocidadeAtual() + "Km/h");
        civic.Acelerar();
        System.out.println("Velocidade Atual do Civic: " + civic.getVelocidadeAtual() + "Km/h");
        civic.Acelerar();
        System.out.println("Velocidade Atual do Civic: " + civic.getVelocidadeAtual() + "Km/h");

        Ferrari ferrari = new Ferrari(400);

        ferrari.ligarTurbo();
        ferrari.Acelerar();
        ferrari.Frear();
        System.out.println("Velocidade Atual da Ferrari: " + ferrari.getVelocidadeAtual() + "Km/h");
        ferrari.Acelerar();
        ferrari.Frear();
        System.out.println("Velocidade Atual da Ferrari: " + ferrari.getVelocidadeAtual() + "Km/h");

        ferrari.Acelerar();
        System.out.println("Velocidade Atual da Ferrari: " + ferrari.getVelocidadeAtual() + "Km/h");

    }

}
