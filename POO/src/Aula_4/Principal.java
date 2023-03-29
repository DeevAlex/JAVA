package Aula_4;

public class Principal {
    public static void main(String[] args) {

        Paciente p = new Paciente();

        p.nome = "Kleber";
        p.rg = "11.111.111-1";
        p.endereco = "Rua Nunca nem Vi";;
        p.telefone = "(11) 90654-5454";
        p.anoNascimento = 2004;
        p.profissao = "CEO";

        p.imprimeDados();
        System.out.println("Idade: " + p.calculaIdade(2023));

        Paciente p2 = new Paciente("Ronaldinho Gaúcho");

        p2.rg = "55.555.555-5";
        p2.endereco = "Rua Capitão Gabriel";;
        p2.telefone = "(11) 91654-5453";
        p2.anoNascimento = 1973;
        p2.profissao = "Diretor de Comunicações";

        p2.imprimeDados();
        System.out.println("Idade: " + p2.calculaIdade(2023));

    }
}