package br.com.services;

import java.util.List;
import java.util.Optional;

import br.com.interfaces.model.IMusica;
import br.com.interfaces.model.IPlaylist;
import br.com.interfaces.model.IUsuario;
import br.com.interfaces.services.IPlayListService;
import br.com.interfaces.services.IRecomendacaoService;
import br.com.interfaces.services.IReproducaoService;
import br.com.model.Playlist;

public class PlayListService implements IPlayListService {
    
    
    IRecomendacaoService recomendacaoService;

    @Override
    public Optional<IPlaylist> criarPlayList(String nome, IUsuario criador) {

        IPlaylist playlist = new Playlist(nome);
        playlist.adicionarColaborador(criador);

        return Optional.of(playlist);
    }

    @Override
    public void compartilharPlayList(IPlaylist playlist, IUsuario usuario) {

    }

    @Override
    public void convidarColaborador(IPlaylist playlist, IUsuario usuario) {
        //verificar possibilidade de retornar um valor para falha( pagina 17) 
        if(!playlist.getColaboradores().contains(usuario)){
             playlist.adicionarColaborador(usuario);
         }
    }

    @Override
    public List<IMusica> recomendarMusicasParaPlayList(IPlaylist playlist) {
        return recomendacaoService.recomendarMusicasParaPlayList(playlist);
    }

    @Override
    public void iniciarReproducaoPlayList(IPlaylist playlist, IUsuario usuario, IReproducaoService reproducaoService) {
        //verificar a importância do artista, nenhum lugar do documento fala isso
        //reproducaoService.reproduzirPlayList(playlist, usuario, artista);
    }

}
