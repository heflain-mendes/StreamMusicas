package br.com.interfaces.services;

import br.com.interfaces.model.IMusica;
import br.com.interfaces.model.IPlaylist;
import br.com.interfaces.model.IUsuario;
import br.com.model.Musica;

import java.util.List;

public interface IRecomendacaoService {
    List<IMusica> recomendarMusicas(IUsuario usuario);
    void registrarReproducao(IMusica musica, IUsuario usuario);
    List<IMusica> recomendarMusicasBaseadoNoHistorico(IReproducaoService reproducaoService, IUsuario usuario);
    List<IMusica> recomendarMusicasParaPlayList(IPlaylist playlist,
                                               IReproducaoService reproducaoService);

}
