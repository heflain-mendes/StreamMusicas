package br.com.interfaces.repository;

import br.com.interfaces.model.IMusica;
import br.com.interfaces.model.IUsuario;
import br.com.model.HistoricoReproducao;

import java.util.List;
import java.util.Optional;

public interface IHistoricoReproducaoRepository {

	void registrarReproducao( IMusica musica, IUsuario usuario );
	List<HistoricoReproducao> getAll();
	Optional<List<HistoricoReproducao>> findAllByUsuario(IUsuario usuario);
}
