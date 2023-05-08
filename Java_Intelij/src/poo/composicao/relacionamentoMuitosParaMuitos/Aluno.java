package poo.composicao.relacionamentoMuitosParaMuitos;

import java.util.ArrayList;

public class Aluno {

    final String nome;
    final ArrayList<Curso> cursos = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
        // this.cursos = new ArrayList<>(); // isso não pode pois a variavel que está la em cima não pode mudar o endereço de memoria, pois é uma constante, o que não é constente que pode mudar no final é os elementos que estão dentro
    }

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso obterCursoPorNome(String nome) {
        for(Curso curso : this.cursos) {
            if (curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null;
    }

    public String toString() {
        return nome;
    }
}
