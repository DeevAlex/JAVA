package Aula_2;

public class Curso {

    int numeroInscritos;
    String nomeCurso;
    String nomeProfessor;
    boolean possuiInscritos;
    boolean matriculado;

    boolean PossuiMatricula() {

        if (matriculado) {
            return matriculado;
        } else {
            return false;
        }

    }
    public boolean Matricular() {
        System.out.printf("Voce acaba de se inscrever no %s, Aproveite!\n", nomeCurso);
        return matriculado = true;
    }

    public boolean Desmatricular() {
        System.out.printf("Voce acaba de se desinscrever no %s", nomeCurso);
        return matriculado = false;
    }


}
