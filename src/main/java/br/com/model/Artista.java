package br.com.model;

import br.com.interfaces.IArtista;
import br.com.interfaces.IMusica;

import java.util.List;
import java.util.Optional;

public class Artista implements IArtista {
    private final String nome;
    private final String biografia;
    private final List<IMusica> discografia;
    private final Optional<List<IMusica>> musicasMaisTocadas;

    public Artista(String nome, String biografia, List<IMusica> discografia, Optional<List<IMusica>> musicasMaisTocadas) {
        this.nome = nome;
        this.biografia = biografia;
        this.discografia = discografia;
        this.musicasMaisTocadas = musicasMaisTocadas;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getBiografia() {
        return this.biografia;
    }

    @Override
    public List<IMusica> getDiscografia() {
        return this.discografia;
    }

    @Override
    public Optional<List<IMusica>> getMusicasMaisTocadas() {
        return this.musicasMaisTocadas;
    }
}
