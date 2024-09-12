package br.com.interfaces;

import java.util.List;

public interface ReproducaoService {
    void reproduzirMusica(Musica musica, Usuario usuario);
    void reproduzirPlayList(PlayList playlist, Usuario usuario);
    void pausarReproducao(Usuario usuario);
    void retomarReproducao(Usuario usuario);
    void pararReproducao(Usuario usuario);
    List<Musica> obterRecomendacoesDuranteReproducao(RecomendacaoService recomendacaoService,
                                                     Usuario usuario);
    String exibirInformacoesArtistaDuranteReproducao(Musica musica,
                                                     ArtistaService artistaService);

}
