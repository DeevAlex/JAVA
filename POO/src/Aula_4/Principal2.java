package Aula_4;
public class Principal2 {
    public static void main(String[] args) {

        Curso c1 = new Curso();

        c1.cadastrarCurso();

        c1.nome = "JavaScript completo, basico ao avançado";
        c1.quantidadeDeAlunos = 35;
        c1.turma = "3J";
        c1.mensalidade = 157.5F;

        c1.imprimeDados();

        Curso c2 = new Curso("Java completo, basico ao avançado", 15, "3A", 185.50F);

        c2.cadastrarCurso();
        c2.imprimeDados();


    }
}