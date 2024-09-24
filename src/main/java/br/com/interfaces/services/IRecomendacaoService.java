package br.com.interfaces.services;

import br.com.interfaces.model.IMusica;
import br.com.interfaces.model.IPlaylist;
import br.com.interfaces.model.IUsuario;

import java.util.List;

public interface IRecomendacaoService {

	void registrarReproducao( IMusica musica, IUsuario usuario );

	List<IMusica> recomendarMusicasBaseadoNoHistorico( IUsuario usuario );

	List<IMusica> recomendarMusicasParaPlayList( IPlaylist playlist );

}
