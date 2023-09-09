package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

    void testeAcessos() {
        Ana sogra = new Ana();
//        segredo
//        facoDentroDeCasa
//        formaDeFalar
//        todosSabem
//        System.out.println(esposa.segredo); // algo privado não pode ser acessado fora da classe onde foi criado
//        System.out.println(sogra.facoDentroDeCasa); // protected tem que estar no mesmo pacote
//        System.out.println(sogra.formaDeFalar);
        System.out.println(sogra.todosSabem);
    }

}
