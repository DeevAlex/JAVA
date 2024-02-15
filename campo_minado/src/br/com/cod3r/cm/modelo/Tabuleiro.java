package br.com.cod3r.cm.modelo;

import br.com.cod3r.cm.excecao.ExplosaoException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Tabuleiro {

    private int linhas;
    private int colunas;

    private int minas;

    private  final List<Campo> campos = new ArrayList<>();

    public Tabuleiro(int linhas, int colunas, int minas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;
        
        gerarCampos();
        associarVizinhos();
        sortearMinas();
    }

    public void abrir(int linha, int coluna) {

        try {

            campos.parallelStream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna).findFirst().ifPresent(c -> c.abrir());

        } catch (ExplosaoException e) {
            campos.forEach(c -> c.setAberto(true));
            throw e; // relançando a exceção
        }

    }

    public void alternarMarcacao(int linha, int coluna) {
        campos.parallelStream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna).findFirst().ifPresent(c -> c.alternarMarcacao());
    }

    private void gerarCampos() {
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                campos.add(new Campo(l, c));
            }
        }
    }

    private void associarVizinhos() {
        for (Campo c1 : campos) {
            for (Campo c2 : campos) {
                c1.adicionarVizinho(c2);
            }
        }
    }

    private void sortearMinas() {
        long minasArmadas = 0;

        Predicate<Campo> minado = c -> c.isMinado();

        do {

            int aleatorio = (int) (Math.random() * campos.size());
            campos.get(aleatorio).minar();
            minasArmadas = campos.stream().filter(minado).count();

        } while (minasArmadas < minas);

    }

    public boolean objetivoAlcancado() {
        return campos.stream().allMatch(c -> c.objetivoAlcancado());
    }

    public void reiniciar() {
        campos.stream().forEach(c -> c.reiniciar());
        sortearMinas();
    }

    public String toString() {
        StringBuilder sB = new StringBuilder(); // usado quando temos muitas concatenações para montar uma String a partir de muitas partes é uma classe interessante para isso

        sB.append("  ");
        for (int cls = 0; cls < colunas; cls++) {
            sB.append(" ");
            sB.append(cls);
            sB.append(" ");
        }

        sB.append("\n");

        int i = 0;
        for (int l = 0; l < linhas; l++) {

            sB.append(l);
            sB.append(" ");

            for (int c = 0; c < colunas; c++) {
                sB.append(" ");
                sB.append(campos.get(i));
                sB.append(" ");
                i++;
            }

                sB.append("\n");

        }

        return sB.toString();
    }

}
