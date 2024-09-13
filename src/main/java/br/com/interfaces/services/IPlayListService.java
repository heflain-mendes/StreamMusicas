package br.com.interfaces.services;

import br.com.interfaces.model.IMusica;
import br.com.interfaces.model.IPlayList;
import br.com.interfaces.model.IUsuario;

import java.util.List;
import java.util.Optional;

public interface IPlayListService {
    Optional<IPlayList> criarPlayList(String nome, IUsuario criador);
    void compartilharPlayList(IPlayList playlist, IUsuario usuario);
    void convidarColaborador(IPlayList playlist, IUsuario usuario);
    List<IMusica> recomendarMusicasParaPlayList(IPlayList playlist,
                                                IRecomendacaoService recomendacaoService);
    void iniciarReproducaoPlayList(IPlayList playlist, IUsuario usuario,
                                   IReproducaoService reproducaoService);
}
