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

    public Optional<IPlaylist> criarPlayList(String nome, IUsuario criador){

		IPlaylist playlist = new Playlist(nome);
		playlist.adicionarColaborador(criador);

		return Optional.of(playlist);
	}

    public void compartilharPlayList(IPlaylist playlist, IUsuario usuario){

	}
    
	public void convidarColaborador(IPlaylist playlist, IUsuario usuario){

	}

    public List<IMusica> recomendarMusicasParaPlayList(IPlaylist playlist, IRecomendacaoService recomendacaoService){
		return null;
	}

    public void iniciarReproducaoPlayList(IPlaylist playlist, IUsuario usuario, IReproducaoService reproducaoService){

	}

}
