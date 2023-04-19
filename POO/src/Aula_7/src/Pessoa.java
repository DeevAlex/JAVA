public class Pessoa {

    String nome, cpf;

    Pessoa() {}

    Pessoa(String n, String c) {
        nome = n;
        cpf = c;
    }

    String getCpf() {
        return cpf;
    }

    String getNome() {
        return nome;
    }

}
