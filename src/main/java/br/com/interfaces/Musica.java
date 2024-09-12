package br.com.interfaces;

public interface Musica {
    String getTitulo();
    String getArtista();
    String getGenero();
    void incrementaContagemReproducao();
    int getQtdVezesReproduzidas();
}
