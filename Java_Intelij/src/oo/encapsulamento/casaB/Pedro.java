package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcessos() {
//        segredo
//        facoDentroDeCasa
//        formaDeFalar
//        todosSabem

        // não precisa esse objeto porque já esta sendo herdado, então é so colocar o atrobuto/metodo
//        Ana mae = new Ana();

//        System.out.println(mae.segredo); // algo privado não pode ser acessado fora da classe onde foi criado
//        System.out.println(facoDentroDeCasa); // protected tem que estar no mesmo pacote
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
    }

}
