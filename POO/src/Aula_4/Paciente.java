package Aula_4;
import java.util.Scanner;

public class Paciente {

    String nome;
    String rg;
    String endereco;
    String telefone;
    int anoNascimento;
    String profissao;

    Paciente() {}

    Paciente(String n) {
        nome = n;
    }

    void imprimeDados() {
        System.out.println("\nNome do Paciente: " + nome);
        System.out.println("RG do Paciente: " + rg);
        System.out.println("Endereço: " + endereco);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Profissão do Paciente: " + profissao + "\n");
    }

    int calculaIdade(int anoAtual) {
        int idade = (anoAtual - anoNascimento);
        return idade;
    }

}
