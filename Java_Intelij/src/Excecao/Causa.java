package Excecao;

public class Causa {

    public static void main(String[] args) {

        try {
            metodoA(null);
        } catch (Exception e) {
            if (e.getCause() != null) {
                System.out.println(e.getMessage()); // Esse pega a mensagem inteira o tipo de exceção e a mensagem, Ex.: java.lang.NullPointerException: Aluno está nulo
                System.out.println(e.getCause().getMessage()); // Esse apenas pega a mensagem, Ex.: Aluno está nulo
            }
        }

        // Aqui ele irá mostrar as duas exceções a original do primeiro metodoB e a segunda exceção do metodoA
        // metodoA(null);

    }

    static void metodoA(Aluno aluno) {

        try {
            metodoB(aluno);
        } catch (Exception cause) {

            // dentro de um catch podemos lançar uma outra exceção com um tipo diferente mesmo ela sendo checada ou não
            throw new IllegalArgumentException(cause);

        }

    }

    static void metodoB(Aluno aluno) {

        if (aluno == null) {
            throw new NullPointerException("Aluno está nulo");
        }

        System.out.println(aluno.nome);

    }

}
