package br.com.repositories;

import br.com.interfaces.model.IUsuario;
import br.com.interfaces.repository.IUsuarioRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsuarioRepository implements IUsuarioRepository {

	private static IUsuarioRepository usuarioRepository;
	private final List<IUsuario> usuarios;

	private UsuarioRepository() {
		this.usuarios = new ArrayList<>();
	}

	public static IUsuarioRepository getUsuarioRepository() {
		if( UsuarioRepository.usuarioRepository == null ) {
			UsuarioRepository.usuarioRepository = new UsuarioRepository();
		}
		return UsuarioRepository.usuarioRepository;
	}

	@Override
	public List<IUsuario> getAll() {
		return this.usuarios;
	}

	@Override
	public Optional<IUsuario> findByNome( String nome ) {
		return this.usuarios.stream().filter( u -> u.getNome().equals( nome ) ).findFirst();
	}

	@Override
	public void inserir( IUsuario usuario ) {
		if( usuario.getNome() == null || usuario.getNome().isEmpty() ) {
			throw new IllegalArgumentException( "Nome do usuário não informado" );
		} else if( usuario.getEmail() == null || usuario.getEmail().isEmpty() ) {
			throw new IllegalArgumentException( "E-mail do usuário não informado" );
		}
		if( this.usuarios.stream().filter( u -> u.getNome().equals( usuario.getNome() ) ).findAny().isEmpty() ) {
			this.usuarios.add( usuario );
		}
	}
}
