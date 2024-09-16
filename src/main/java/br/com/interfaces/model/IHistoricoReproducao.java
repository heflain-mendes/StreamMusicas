package br.com.interfaces.model;

public interface IHistoricoReproducao {
    public void registrarReproducao();
    public boolean mesmoUsuario( IUsuario usuario );
    public boolean mesmaMusicaMesmoUsuario( IMusica musica, IUsuario usuario );
    public IMusica getMusica();
    public IUsuario getUsuario();
    public int getQuantidadeVezesTocadas();
}
