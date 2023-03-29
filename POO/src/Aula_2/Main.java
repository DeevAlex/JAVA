package Aula_2;

public class Main {

    public static void main(String[] args) {

        // Classe Cliente Instanciada
        Cliente cliente01 = new Cliente();

        // Classe Cliente Instanciada
        Curso curso01 = new Curso();

        cliente01.nome = "Alex";
        cliente01.endereco = "Rua das Lagos, 154, Casa C";
        cliente01.idade = 18;
        cliente01.desconto = false;
        System.out.printf("Nome do Cliente: %s\n", cliente01.nome);
        System.out.printf("Endereço do Cliente: %s\n", cliente01.endereco);
        System.out.printf("Idade do Cliente: %d\n", cliente01.idade);
        System.out.printf("Cliente Possuí Desconto: %b\n", cliente01.PossuiDesconto());
        cliente01.ComprarCurso();

        System.out.println("----------------------------------------");

        curso01.nomeCurso = "Aprendendo POO na pratica";
        curso01.nomeProfessor = "João";
        curso01.numeroInscritos = 154_000;
        curso01.possuiInscritos = true;
        curso01.Matricular();

        System.out.printf("Curso: %s\n", curso01.nomeCurso);
        System.out.printf("Professor: %s\n", curso01.nomeProfessor);
        System.out.printf("Numero de Alunos: %d\n", curso01.numeroInscritos);
        System.out.printf("Possui Alunos: %b\n", curso01.possuiInscritos);
        System.out.printf("Aluno Matriculado: %b", curso01.PossuiMatricula());

    }

}
