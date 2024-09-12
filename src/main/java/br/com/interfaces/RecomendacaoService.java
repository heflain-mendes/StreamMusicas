package br.com.interfaces;

import java.util.List;

public interface RecomendacaoService {
    List<Musica> recomendarMusicas(Usuario usuario);
    void registrarReproducao(Musica musica, Usuario usuario);
    List<Musica> recomendarMusicasBaseadoNoHistorico(ReproducaoService reproducaoService, Usuario usuario);
    List<Musica> recomendarMusicasParaPlayList(PlayList playlist,
                                               ReproducaoService reproducaoService);
}
