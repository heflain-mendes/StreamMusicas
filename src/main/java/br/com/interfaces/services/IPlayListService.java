package br.com.interfaces.services;

import br.com.interfaces.model.IMusica;
import br.com.interfaces.model.IPlaylist;
import br.com.interfaces.model.IUsuario;

import java.util.List;
import java.util.Optional;

public interface IPlayListService {
    Optional<IPlaylist> criarPlayList(String nome, IUsuario criador);
    void compartilharPlayList(IPlaylist playlist, IUsuario usuario);
    void convidarColaborador(IPlaylist playlist, IUsuario usuario);
    List<IMusica> recomendarMusicasParaPlayList(IPlaylist playlist);
    void iniciarReproducaoPlayList(IPlaylist playlist, IUsuario usuario,
                                   IReproducaoService reproducaoService);
}
