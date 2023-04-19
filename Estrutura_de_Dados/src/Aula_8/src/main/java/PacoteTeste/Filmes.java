
package PacoteTeste;

public class Filmes {
    
    String titulo;
    String diretor;
    String genero;
    String pais;
    String ano;

    public Filmes() {
    }

    public Filmes(String titulo, String diretor, String genero, String pais, String ano) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.genero = genero;
        this.pais = pais;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getGenero() {
        return genero;
    }

    public String getPais() {
        return pais;
    }

    public String getAno() {
        return ano;
    }
}
