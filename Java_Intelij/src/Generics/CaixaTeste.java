package Generics;

import java.util.ArrayList;
import java.util.Dictionary;

public class CaixaTeste {

    public static void main(String[] args) {

        // Caixa caixaA = new Caixa(); // caso não coloquemos o generics aqui com o tipo do dado recebido, por padrão será do tipo Object (porém vai ficar com um warning)

        Caixa<String> caixaA = new Caixa<>(); // daqui para frente só será aceito nos metodos/atributos da classe CAIXA onde tem o TUPO_RECEBIDO esse tipo String

        caixaA.guardar("Segredo!");

        String coisaA = caixaA.abrir();

        System.out.println(coisaA);

        // Aqui deve ser a classe que representa o tipo que nesse caso é o Double, porém, podemos colocar os valores que estão/virão dos metodos/atributos em tipo primitivos como ali em baixo no coisaB
        Caixa<Double> caixaB = new Caixa<>(); // daqui para frente só será aceito nos metodos/atributos da classe CAIXA onde tem o TUPO_RECEBIDO esse tipo String

        caixaB.guardar(3.1415);

        double coisaB = caixaB.abrir();

        System.out.println(coisaB);

    }

}
