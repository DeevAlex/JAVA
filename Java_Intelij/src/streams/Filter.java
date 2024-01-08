package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.8, false, false);
        Aluno a2 = new Aluno("Bia", 5.6, true, false);
        Aluno a3 = new Aluno("Daniel", 9.8, true, true);
        Aluno a4 = new Aluno("Gui", 6.8, false, false);
        Aluno a5 = new Aluno("Rebeca", 7.1, true, false);
        Aluno a6 = new Aluno("Pedro", 8.8, false, true);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        // Antes

        // recebe aluno e retorna true ou false
        Predicate<Aluno> estaAprovado = a -> a.nota >= 7;
        Predicate<Aluno> estaEstagiando = a -> a.isEstagiando;
        Predicate<Aluno> estaFazendoIniciacaoCientifica = a -> a.isFazendoIniciacaoCientifica;
        // recebe aluno e retorna string
        Function<Aluno, String> saudacaoAprovado = a -> "Parabens, " + a.nome + ", Você foi aprovado(a)";

        // Com a API Streams

        // filtramos os alunos com nota >= 7 para depois fazermos um mapeamento de um objeto Aluno para String
        alunos.stream().filter((aluno -> aluno.nota >= 7)).filter(aluno -> aluno.isEstagiando).filter(aluno -> aluno.isFazendoIniciacaoCientifica).map(a -> "Parabens, " + a.nome + ", você foi aprovado(a)!").forEach(System.out::println);

    }

}
