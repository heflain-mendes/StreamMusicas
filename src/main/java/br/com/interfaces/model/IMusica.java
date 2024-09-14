package br.com.interfaces.model;

public interface IMusica {
    String getTitulo();
    String getArtista();
    String getGenero();
    void incrementaContagemReproducao();
    int getQtdVezesReproduzidas();
    double getDuracao();
}
