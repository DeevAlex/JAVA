package Excecao.personalizadaA;

import Excecao.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {

        // #1 - tratamento diferente
        try {
            Aluno a1 = new Aluno("Alex", -7);
            Validar.aluno(a1);
            // Validar.aluno(null);
        } catch (StringVaziaException | NumeroForaDoIntervaloException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        }

        // #2 - mesmo tratamento
//        try {
//            Aluno a1 = new Aluno("Alex", -7);
//            Validar.aluno(a1);
//        } catch (StringVaziaException | NumeroNegativoException e) {
//            System.out.println(e.getMessage());
//        }

        System.out.println("Fim");

    }

}
