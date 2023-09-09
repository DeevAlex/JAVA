package oo.desafio;

public class ClasseTeste {

    public static void main(String[] args) {

        Carro carro = new Carro(500);
        Civic civic = new Civic();
        Ferrari ferrari = new Ferrari(400);

        System.out.println("Velocidade Atual do Carro: " + carro.velocidadeAtual + "Km/h");
        System.out.println("Velocidade Atual do Civic: " + civic.velocidadeAtual + "Km/h");
        System.out.println("Velocidade Atual da Ferrari: " + ferrari.velocidadeAtual + "Km/h");

        carro.Acelerar();
        civic.Acelerar();
        ferrari.Acelerar();

        System.out.println("\nVelocidade Atual do Carro: " + carro.velocidadeAtual + "Km/h");
        System.out.println("Velocidade Atual do Civic: " + civic.velocidadeAtual + "Km/h");
        System.out.println("Velocidade Atual da Ferrari: " + ferrari.velocidadeAtual + "Km/h");

        carro.Acelerar();
        carro.Acelerar();
        civic.Acelerar();
        civic.Acelerar();
        ferrari.Acelerar();
        ferrari.Acelerar();

        System.out.println("Velocidade Atual do Carro: " + carro.velocidadeAtual + "Km/h");
        System.out.println("Velocidade Atual do Civic: " + civic.velocidadeAtual + "Km/h");
        System.out.println("Velocidade Atual da Ferrari: " + ferrari.velocidadeAtual + "Km/h");

        carro.Frear();
        civic.Frear();
        ferrari.Frear();

        System.out.println("Velocidade Atual do Carro: " + carro.velocidadeAtual + "Km/h");
        System.out.println("Velocidade Atual do Civic: " + civic.velocidadeAtual + "Km/h");
        System.out.println("Velocidade Atual da Ferrari: " + ferrari.velocidadeAtual + "Km/h");

    }

}
