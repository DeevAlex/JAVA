package Excecao;

import java.util.Objects;

public class Aluno {

    public final String nome;
    public final double nota;

    public final boolean isEstagiando;
    public final boolean isFazendoIniciacaoCientifica;

    public Aluno(String nome, double nota) {
        this(nome, nota, false, false); // chamando o construtor ali em baixo também
    }

    public Aluno(String nome, double nota, boolean isEstagiando, boolean isFazendoIniciacaoCientifica) {
        this.nome = nome;
        this.nota = nota;
        this.isEstagiando = isEstagiando;
        this.isFazendoIniciacaoCientifica = isFazendoIniciacaoCientifica;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(nota, aluno.nota) == 0 && isEstagiando == aluno.isEstagiando && isFazendoIniciacaoCientifica == aluno.isFazendoIniciacaoCientifica && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota, isEstagiando, isFazendoIniciacaoCientifica);
    }
}
