package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        Consumer<String> print =  System.out::print;
        Consumer<Integer> println =  System.out::println;

        // criando uma stream
        Stream<String> langs = Stream.of("Java ", "Lua ", "JavaScript\n");

        langs.forEach(print);

        // criando um stream com um array normal
        String[] maisLangs = { "Python ", "Lisp ", "Pearl ", "Go\n" };

        Stream.of(maisLangs).forEach(print);

        Arrays.stream(maisLangs).forEach(print);
        // pegando um subconjunto ou um subarray e trasformar em uma stream
        Arrays.stream(maisLangs, 1, 4).forEach(print);

        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
        outrasLangs.stream().forEach(print);

        // abrindo uma stream paralela, os dados não são processados na ordem
        outrasLangs.parallelStream().forEach(print);

        // o generate ele gera uma stream potencialmente infinita que não tem uma ordenação
        // Stream.generate(() -> "A").forEach(print);

        // o iterate nesse caso temos uma ordenação
        Stream.iterate(0, n -> n + 1).forEach(println);

    }

}
