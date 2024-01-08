package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MinMax {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
            if (aluno1.nota > aluno2.nota) return 1;
            if (aluno1.nota < aluno2.nota) return -1;
            return 0;
        };

        // tem como objetivo comprar dois objetos
        Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
            if (aluno1.nota > aluno2.nota) return -1;
            if (aluno1.nota < aluno2.nota) return 1;
            return 0;
        };

        // Quando não temos um toString() o java gera um hashCode para essa classe, Ex.: <o que estamos usando, como nesse caso é (streams)>.<nome_classe>@<hashCode, Ex.: 6f496d9f>
        System.out.println(alunos.stream().max(melhorNota).get() + " tem nota " + alunos.stream().max(melhorNota).get().nota);
        System.out.println(alunos.stream().min(piorNota).get() + " tem nota " + alunos.stream().min(piorNota).get().nota);

        System.out.println(alunos.stream().min(melhorNota).get() + " tem nota " + alunos.stream().min(melhorNota).get().nota);
        System.out.println(alunos.stream().max(piorNota).get() + " tem nota " + alunos.stream().max(piorNota).get().nota);

    }

}
