package br.com.interfaces;

import java.util.List;

public interface PlayList {
    String getNome();
    List<Musica> getMusicas();
    void adicionarMusica(Musica musica);
    void removerMusica(Musica musica);
    boolean isPublica();
    void setPublica(boolean publica);
    void adicionarColaborador(Usuario usuario);
    List<Usuario> getColaboradores();

}
