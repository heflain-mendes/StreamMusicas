package br.com.interfaces.repository;

import br.com.interfaces.model.IUsuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioRepository {

	List<IUsuario> getAll();

	Optional<IUsuario> findByNome( String name );

	void inserir( IUsuario usuario );
}
