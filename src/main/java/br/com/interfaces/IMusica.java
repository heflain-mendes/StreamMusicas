package br.com.interfaces;

public interface IMusica {
    String getTitulo();
    String getArtista();
    String getGenero();
    void incrementaContagemReproducao();
    int getQtdVezesReproduzidas();
}
