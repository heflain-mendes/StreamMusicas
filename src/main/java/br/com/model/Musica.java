package br.com.model;

import br.com.interfaces.model.IMusica;

public class Musica implements IMusica {
    private String titulo;
    private String artista;
    private String genero;
    private  int qtdVezesReproduzida;
    private double duracao;

    public Musica(String titulo, String artista, String genero, double duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.duracao = duracao;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getArtista() {
        return artista;
    }

    @Override
    public String getGenero() {
        return this.genero;
    }

    @Override
    public void incrementaContagemReproducao() {
        this.qtdVezesReproduzida++;
    }

    @Override
    public int getQtdVezesReproduzidas() {
        return this.qtdVezesReproduzida;
    }

    @Override
    public double getDuracao() {
        return this.duracao;
    }
}
