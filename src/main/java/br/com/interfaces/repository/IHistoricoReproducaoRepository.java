package br.com.interfaces.repository;

import br.com.interfaces.model.IHistoricoReproducao;
import br.com.interfaces.model.IMusica;
import br.com.interfaces.model.IUsuario;

import java.util.List;
import java.util.Optional;

public interface IHistoricoReproducaoRepository {
    void registrarReproducao(IMusica musica, IUsuario usuario );
    List<IHistoricoReproducao> getAll();
    Optional<List<IHistoricoReproducao>> findAllByUsuario(IUsuario usuario);
}
