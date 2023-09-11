package oo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {


        Pessoa p1 = new Pessoa("Carlos", "Almeida", 35);

        p1.setNome("Jonas");
        p1.setSobrenome("Caldeira");
        p1.setIdade(15);

        System.out.println("Nome: " + p1.getNomeCompleto() + ", Idade: " + p1.getIdade());

    }

}
