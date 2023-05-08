package poo.composicao.relacionamentoMuitosParaMuitos;

public class CursoAlunoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Alex");
        Aluno aluno2 = new Aluno("Pedro");
        Aluno aluno3 = new Aluno("Joana");

        Curso curso1 = new Curso("Java Completo e Profissional");
        Curso curso2 = new Curso("JavaScript Completo e Profissional");
        Curso curso3 = new Curso("C# Completo e Profissional");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for(Aluno aluno : curso1.alunos) {
            System.out.println("Estou matriculado no curso: " + curso1.nome + "...");
            System.out.println("Meu nome é: " + aluno.nome);
        }

        System.out.println(aluno1.cursos.get(0).alunos);

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo e Profissional");

        if (cursoEncontrado != null) {
            System.out.println("Curso: " + cursoEncontrado.nome);
            System.out.println("Alunos: " + cursoEncontrado.alunos);
        }

    }

}
