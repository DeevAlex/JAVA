package oo.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

    public static void main(String[] args) {

        // classe monstro recebendo tudo da classe Jogador pela herança
        Monstro monstro = new Monstro();

        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi(10, 11);

        heroi.x = 10;
        heroi.y = 11;

//        j1.andar(Direcao.NORTE);
//        j1.andar(Direcao.LESTE);
//        j1.andar(Direcao.NORTE);
//        j1.andar(Direcao.LESTE);

        System.out.println("HP do Monstro: " + monstro.vida);
        System.out.println("HP do Heroi: " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("HP do Monstro: " + monstro.vida);
        System.out.println("HP do Heroi: " + heroi.vida);

    }
    
}
