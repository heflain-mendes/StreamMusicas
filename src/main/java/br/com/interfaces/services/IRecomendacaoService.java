package br.com.interfaces.services;

import br.com.interfaces.model.IPlaylist;
import br.com.interfaces.model.IUsuario;
import br.com.model.Musica;

import java.util.List;

public interface IRecomendacaoService {
    List<Musica> recomendarMusicas(IUsuario usuario);
    void registrarReproducao(Musica musica, IUsuario usuario);
    List<Musica> recomendarMusicasBaseadoNoHistorico(IReproducaoService reproducaoService, IUsuario usuario);
    List<Musica> recomendarMusicasParaPlayList(IPlaylist playlist,
                                               IReproducaoService reproducaoService);

}
