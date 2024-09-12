package br.com.interfaces;

import java.util.List;
import java.util.Optional;

public interface PlayListService {
    Optional<PlayList> criarPlayList(String nome, Usuario criador);
    void compartilharPlayList(PlayList playlist, Usuario usuario);
    void convidarColaborador(PlayList playlist, Usuario usuario);
    List<Musica> recomendarMusicasParaPlayList(PlayList playlist,
                                               RecomendacaoService recomendacaoService);
    void iniciarReproducaoPlayList(PlayList playlist, Usuario usuario,
                                   ReproducaoService reproducaoService);

}
