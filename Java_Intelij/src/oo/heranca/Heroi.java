package oo.heranca;

public class Heroi extends Jogador {

    public Heroi(int x, int y) {
        super(x, y); // caso coloque chame o super ele se refere ao construtor da classe pai, e caso tenha mais de um construtor devemos ter as mesmas parametros dos outros contrutores
    }

    // sobreescrevendo o metodo
    @Override
    public boolean atacar(Jogador oponente) {

        // sobrescrevendo o metodo da classe pai
//        int deltaX = Math.abs(x - oponente.x);
//        int deltaY = Math.abs(y - oponente.y);
//
//        if (deltaX == 0 && deltaY == 1) {
//            oponente.vida -= 20;
//            return true;
//        } else if (deltaX == 1 && deltaY == 0) {
//            oponente.vida -= 20;
//            return true;
//        } else {
//            return false;
//        }

        // Metodo de cima - chamando o metodo pai para atacar duas vezes
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        boolean ataque3 = super.atacar(oponente);

        return ataque1 || ataque2 || ataque3;

    }

}
