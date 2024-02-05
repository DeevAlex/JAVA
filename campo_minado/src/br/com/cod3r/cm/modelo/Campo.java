package br.com.cod3r.cm.modelo;

import br.com.cod3r.cm.excecao.ExplosaoException;

import java.util.ArrayList;
import java.util.List;

public class Campo {

    private final int linha;
    private final int coluna;

    private boolean aberto;
    private boolean minado;
    private boolean marcado;

    // Auto-Relacionamento uma lista que recebe parametros dessa mesma classe
    private List<Campo> vizinhos = new ArrayList<>();

    Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    boolean adicionarVizinho(Campo vizinhoCandidato) {

        boolean linhaDiferente = linha != vizinhoCandidato.linha;
        boolean colunaDiferente = coluna != vizinhoCandidato.coluna;
        boolean diagonal = linhaDiferente && colunaDiferente;

        int deltaLinha = Math.abs(linha - vizinhoCandidato.linha);
        int deltaColuna = Math.abs(coluna - vizinhoCandidato.coluna);
        int deltaGeral = deltaColuna + deltaLinha;

        if (deltaGeral == 1 && !diagonal) {
            vizinhos.add(vizinhoCandidato);
            return true;
        } else if (deltaGeral == 2 && diagonal) {
            vizinhos.add(vizinhoCandidato);
            return true;
        } else {
            return false;
        }

    }

    void alternarMarcacao() {

        if (!aberto) {
            marcado = !marcado;
        }

    }

    boolean abrir() {

        if (!aberto && !marcado) {
            aberto = true;

            if (minado) {
                throw new ExplosaoException();
            }

            if (vizinhancaSegura()) {
                vizinhos.forEach(v -> v.abrir());
            }

            return true;

        } else {
            return false;
        }

    }

    boolean vizinhancaSegura() {
        return vizinhos.stream().noneMatch(v -> v.minado);
    }

}
