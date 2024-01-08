package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class OutrosMetodos {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);
        Aluno a5 = new Aluno("Ana", 7.1);
        Aluno a6 = new Aluno("Pedro", 6.1);
        Aluno a7 = new Aluno("Gui", 8.1);
        Aluno a8 = new Aluno("Maria", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("distinct..."); // distinct, para que não pegue valores duplicados (devemos implementar os metodos equals e o hashCode na classe, que nesse caso é a Aluno)
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit"); // conseguimos fazer paginação dentro do stream
        alunos.stream().distinct().skip(2).limit(2).forEach(System.out::println); // esse skip pula dois objetos Aluno e o limit define até qual objeto vai

        System.out.println("\ntakeWhile"); // usado para pegar elementos enquanto acontecer determinada condição
        alunos.stream().distinct().skip(2).takeWhile(a -> a.nota >= 7).forEach(System.out::println);

    }

}
