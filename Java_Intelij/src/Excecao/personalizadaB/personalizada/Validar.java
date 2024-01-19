package Excecao.personalizadaB.personalizada;

import Excecao.Aluno;

public class Validar {

    private Validar() {

    }

    // Como colocamos uma exceção Exception precisamos colocar aqui ao lado da assinatura do metodo um THROWS com apenas Exception ou as exceções que criamos como coloquei aqui
    public static void aluno(Aluno aluno) throws StringVaziaException, NumeroForaDoIntervaloException {

        if (aluno == null) {
            throw new IllegalArgumentException("O aluno está nulo"); // Excecão do java
        }

        if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new StringVaziaException("nome"); // Nossa exceção personalizadaA
        }

        if (aluno.nota < 0 || aluno.nota > 10) {
            throw new NumeroForaDoIntervaloException("nota");
        }

    }

}
