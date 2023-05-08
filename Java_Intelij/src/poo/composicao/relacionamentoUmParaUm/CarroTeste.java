package poo.composicao.relacionamentoUmParaUm;

public class CarroTeste {

    public static void main(String[] args) {

        // Relação um pra um, um carro tem um motor e um motor tem um carro -> relação unidirecional
        Carro c1 = new Carro();

        System.out.println(c1.estaLigado());

        c1.ligar();

        System.out.println(c1.estaLigado());

        System.out.println(c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println(c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        // c1.motor.carro.motor.carro.motor.giros(); isso é possivel pois é uma relação bidirecional

        // faltou Encapsulamento!!
        // c1.motor.fatorInjecao = -30;

        System.out.println(c1.motor.giros());

    }

}
