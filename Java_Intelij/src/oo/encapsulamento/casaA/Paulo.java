package oo.encapsulamento.casaA;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcessos() {
//        segredo
//        facoDentroDeCasa
//        formaDeFalar
//        todosSabem
//        System.out.println(esposa.segredo); // algo privado não pode ser acessado fora da classe onde foi criado
        System.out.println(esposa.facoDentroDeCasa); // protected tem que estar no mesmo pacote
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);
    }

}
