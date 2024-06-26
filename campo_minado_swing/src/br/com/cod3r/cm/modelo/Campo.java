package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class Campo {

    private final int linha;
    private final int coluna;

    private boolean aberto;
    private boolean minado;
    private boolean marcado;

    // Auto-Relacionamento uma lista que recebe parametros dessa mesma classe
    private List<Campo> vizinhos = new ArrayList<>();
    private List<CampoObservador> observadores = new ArrayList<>();

    Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public void RegistrarObservador(CampoObservador obs) {
        observadores.add(obs);
    }

    private void NotificarObservadores(CampoEvento e) {
        observadores.stream().forEach(obs -> obs.EventoOcorreu(this, e));
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

            if (marcado) {
                NotificarObservadores(CampoEvento.MARCAR);
            } else {
                NotificarObservadores(CampoEvento.DESMARCAR);
            }

        }

    }

    boolean abrir() {

        if (!aberto && !marcado) {

            if (minado) {
                NotificarObservadores(CampoEvento.EXPLODIR);
                return true;
            }

            setAberto(true);

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

    void minar() {
        minado = true;
    }

    public boolean isMinado() {
        return minado;
    }

    public boolean isMarcado() {
        return marcado;
    }

    void setAberto(boolean aberto) {
        this.aberto = aberto;

        if (aberto) {
            NotificarObservadores(CampoEvento.ABRIR);
        }

    }

    public boolean isAberto() {
        return aberto;
    }

    public boolean isFechado() {
        return !isAberto();
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    boolean objetivoAlcancado() {
        boolean desvendado = !minado && aberto;
        boolean protegido = minado && marcado;

        return desvendado || protegido;
    }

    long minasNaVizinhanca() {
        return vizinhos.stream().filter(v -> v.minado).count();
    }

    void reiniciar() {
        aberto = false;
        minado = false;
        marcado = false;
    }

}
