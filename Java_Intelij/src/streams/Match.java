package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        // usado para filtrar
        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        System.out.println(alunos.stream().allMatch(aprovado)); // allMatch, verifica se todos os alunos foram aprovados
        System.out.println(alunos.stream().anyMatch(aprovado)); // anyMatch, verifica se algum dos alunos foram aprovados
        System.out.println(alunos.stream().noneMatch(aprovado.negate())); // noneMatch, verifica se nenhum dos alunos foram aprovados

    }

}
