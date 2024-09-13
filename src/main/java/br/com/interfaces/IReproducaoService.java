package br.com.interfaces;

public interface IReproducaoService {
    void reproduzirMusica(IMusica musica, IUsuario usuario);
    void reproduzirPlayList(IPlayList playlist, IUsuario usuario);
    void pausarReproducao(IUsuario usuario);
    void retomarReproducao(IUsuario usuario);
    void pararReproducao(IUsuario usuario);
    List<IMusica> obterRecomendacoesDuranteReproducao(IRecomendacaoService recomendacaoService, IUsuario usuario);
    String exibirInformacoesArtistaDuranteReproducao(IMusica musica, IArtistaService artistaService);
}