package Aula_4;
public class Curso {

    String nome;
    int quantidadeDeAlunos;
    String turma;
    float mensalidade;

    Curso() {}

    Curso(String n, int q, String t, float m) {
        nome = n;
        quantidadeDeAlunos = q;
        turma = t;
        mensalidade = m;
    }

    void cadastrarCurso() {
        System.out.println("Voce acaba de se inscrever no curso: " + nome);
    }

    void imprimeDados() {
        System.out.println("\nNome: " + nome);
        System.out.println("Pessoas Cursando: " + quantidadeDeAlunos);
        System.out.println("Turma: " + turma);
        System.out.println("Valor da Mensalidade: " + mensalidade + "\n");
    }

}
