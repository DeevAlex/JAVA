package oo.heranca;

public class Monstro extends Jogador {

    //    por padrão:
    //    Uma classe tem um construtor padrão e esse construtor padrão chama o construtor do padrão da classe pai se lá
    //    na classe pai o construtor padrão não estiver definido você precisa e explicitamente definir o construtor
    //    e chamar o super passando os parâmetros corretos.
    //    Porque o Java não sabe como criar esse objeto a não ser que você for lá e explicitamente diga quais são os parâmetros
    //    necessarios para criar a classe super, uma vez que você instancia uma classe especifica não apenas essa classe é
    //    instanciada mas todos os construtores e toda a hierarquia é chamada, de tal forma que uma que sempre uma classe chama
    //    chama o super para a outra classe seja da forma implicita ou seja de forma explicita

    public Monstro() { // aqui não precisamos colocar nenhum parametro pois ele já esta pegando o valor x e y da classe pai
        this(0, 0); // aqui estamos colocando valores no construtor da classe pai
    }

    public Monstro(int x, int y) {
        super(x, y); // ali em cima podemos colocar o this(), pois o this ali está chamando esse construtor e esse super está chamando o construtor da classe pai
    }

    // palavra extends é reservada do java que indica herança

}
