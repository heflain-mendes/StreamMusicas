package br.com.model;

import br.com.interfaces.model.IMusica;
import br.com.interfaces.model.IUsuario;

public class HistoricoReproducao {

	private final IMusica musica;
	private final IUsuario usuario;
	private int quantidadeVezesTocadas;

	public HistoricoReproducao( IMusica musica, IUsuario usuario ) {
		this.usuario = usuario;
		this.musica = musica;
		this.quantidadeVezesTocadas = 1;
	}

	public void registrarReproducao() {
		this.quantidadeVezesTocadas++;
	}

	public boolean mesmoUsuario( IUsuario usuario ) {
		return usuario.getNome().equals( this.usuario.getNome() ) && usuario.getEmail().equals( usuario.getEmail() );
	}

	public boolean mesmaMusicaMesmoUsuario( IMusica musica, IUsuario usuario ) {
		return musica.getTitulo().equals( this.musica.getTitulo() ) && mesmoUsuario( usuario );
	}

	public IMusica getMusica() {
		return musica;
	}

	public IUsuario getUsuario() {
		return usuario;
	}

	public int getQuantidadeVezesTocadas() {
		return quantidadeVezesTocadas;
	}
}
