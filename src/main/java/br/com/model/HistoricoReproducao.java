package br.com.model;

import br.com.interfaces.model.IHistoricoReproducao;
import br.com.interfaces.model.IMusica;
import br.com.interfaces.model.IUsuario;

public class HistoricoReproducao implements IHistoricoReproducao {
    private final IMusica musica;
    private final IUsuario usuario;
    private int quantidadeVezesTocadas;

    public HistoricoReproducao( IMusica musica, IUsuario usuario ) {
        this.usuario = usuario;
        this.musica = musica;
        this.quantidadeVezesTocadas = 1;
    }

    @Override
    public void registrarReproducao() {
        this.quantidadeVezesTocadas++;
    }

    @Override
    public boolean mesmoUsuario( IUsuario usuario ) {
        return usuario.getNome().equals( this.usuario.getNome() ) && usuario.getEmail().equals( usuario.getEmail() );
    }

    @Override
    public boolean mesmaMusicaMesmoUsuario( IMusica musica, IUsuario usuario ) {
        return musica.getTitulo().equals( this.musica.getTitulo() ) && mesmoUsuario( usuario );
    }

    @Override
    public IMusica getMusica() {
        return musica;
    }

    @Override
    public IUsuario getUsuario() {
        return usuario;
    }

    @Override
    public int getQuantidadeVezesTocadas() {
        return quantidadeVezesTocadas;
    }
}
