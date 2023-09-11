package oo.polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.65);

        Arroz ingrediente1 = new Arroz(0.2);
        Feijao ingrediente2 = new Feijao(0.1);
        Sorvete sobremesa = new Sorvete(0.4);

        System.out.println(convidado.getPeso());

        convidado.Comer(ingrediente1);
        convidado.Comer(ingrediente2);

        System.out.println(convidado.getPeso());

        convidado.Comer(sobremesa);

        System.out.println(convidado.getPeso());


    }

}
