package br.com.interfaces;

import java.util.List;

public interface IRecomendacaoService {
    List<IMusica> recomendarMusicas(IUsuario usuario);
    void registrarReproducao(IMusica musica, IUsuario usuario);
    List<IMusica> recomendarMusicasBaseadoNoHistorico(IReproducaoService reproducaoService, IUsuario usuario);
    List<IMusica> recomendarMusicasParaPlayList(IPlayList playlist,
                                               IReproducaoService reproducaoService);
}
