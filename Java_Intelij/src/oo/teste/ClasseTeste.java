package oo.teste;

import oo.desafio.Carro;
import oo.desafio.Civic;
import oo.desafio.Ferrari;

public class ClasseTeste {
// podemos alterar o nivel de visibilidade da classe para package e public, de resto da erro

    public static void main(String[] args) {

        Civic civic = new Civic();
        Ferrari ferrari = new Ferrari(400);

        System.out.println("Velocidade Atual do Civic: " + civic.getVelocidadeAtual() + "Km/h");
        System.out.println("Velocidade Atual da Ferrari: " + ferrari.getVelocidadeAtual() + "Km/h");

        civic.Acelerar();
        ferrari.Acelerar();

        System.out.println("Velocidade Atual do Civic: " + civic.getVelocidadeAtual() + "Km/h");
        System.out.println("Velocidade Atual da Ferrari: " + ferrari.getVelocidadeAtual() + "Km/h");

        civic.Frear();
        ferrari.Frear();

        System.out.println("Velocidade Atual do Civic: " + civic.getVelocidadeAtual() + "Km/h");
        System.out.println("Velocidade Atual da Ferrari: " + ferrari.getVelocidadeAtual() + "Km/h");

    }

}
