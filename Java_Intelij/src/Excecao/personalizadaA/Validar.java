package Excecao.personalizadaA;

import Excecao.Aluno;

public class Validar {

    private Validar() {

    }

    public static void aluno(Aluno aluno) {

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
