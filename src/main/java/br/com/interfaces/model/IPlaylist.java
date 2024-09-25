package br.com.interfaces.model;

import java.util.List;

public interface IPlaylist {
    String getNome();
    List<IMusica> getMusicas();
    void adicionarMusica(IMusica musica);
    void removerMusica(IMusica musica);
    boolean isPublica();
    void setPublica(boolean publica);
    void adicionarColaborador(IUsuario usuario);
    List<IUsuario> getColaboradores();
    public IUsuario getCriador();
}
