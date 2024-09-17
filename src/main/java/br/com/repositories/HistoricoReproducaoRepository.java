package br.com.repositories;

import br.com.interfaces.model.IHistoricoReproducao;
import br.com.interfaces.model.IMusica;
import br.com.interfaces.model.IUsuario;
import br.com.interfaces.repository.IHistoricoReproducaoRepository;
import br.com.model.HistoricoReproducao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HistoricoReproducaoRepository implements IHistoricoReproducaoRepository {

	private static IHistoricoReproducaoRepository historicoReproducaoRepository;
	private final List<IHistoricoReproducao> historicosReproducao;

	private HistoricoReproducaoRepository() {
		this.historicosReproducao = new ArrayList<>();
	}

	public static IHistoricoReproducaoRepository getHistoricoReproducaoRepository() {
		if( HistoricoReproducaoRepository.historicoReproducaoRepository == null ) {
			HistoricoReproducaoRepository.historicoReproducaoRepository = new HistoricoReproducaoRepository();
		}
		return HistoricoReproducaoRepository.historicoReproducaoRepository;
	}

	@Override
	public void registrarReproducao( IMusica musica, IUsuario usuario ) {
		historicosReproducao.stream().filter( reproducao -> reproducao.mesmaMusicaMesmoUsuario( musica, usuario ) ).findFirst().ifPresentOrElse( IHistoricoReproducao::registrarReproducao, () -> historicosReproducao.add( new HistoricoReproducao( musica, usuario ) ) );
	}

	@Override
	public List<IHistoricoReproducao> getAll() {
		return this.historicosReproducao;
	}

	@Override
	public Optional<List<IHistoricoReproducao>> findAllByUsuario( IUsuario usuario ) {
		return Optional.of( this.historicosReproducao.stream().filter( historicoReproducao -> historicoReproducao.mesmoUsuario( usuario ) ).toList() );
	}

}
