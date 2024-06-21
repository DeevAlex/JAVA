package br.com.cod3r.cm.modelo;

@FunctionalInterface
public interface CampoObservador {

    public void EventoOcorreu(Campo c, CampoEvento e);

}
