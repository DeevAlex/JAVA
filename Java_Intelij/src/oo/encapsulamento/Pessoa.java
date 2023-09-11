package oo.encapsulamento;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Pessoa(String nome, String sobrenome, int idade) {
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }

    // Getters
    public int getIdade() {
        return idade;
    }

    public String getNomeCompleto() {
        return this.getNome() + " " + this.getSobrenome();
    }

    // Setters
    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 120) {
            this.idade = idade;
        }
    }
}
