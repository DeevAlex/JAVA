package Generics;

public class ParesTeste {

    public static void main(String[] args) {

        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.Adicionar(1, "Juliana");
        resultadoConcurso.Adicionar(2, "Pedro");
        resultadoConcurso.Adicionar(3, "Kleber");
        resultadoConcurso.Adicionar(4, "Mariana");
        resultadoConcurso.Adicionar(2, "Rebeca");

        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(4));
        System.out.println(resultadoConcurso.getValor(2));

    }

}
