package br.com.model;

import br.com.interfaces.Musica;

import java.util.List;
import java.util.Optional;

public class Artista implements br.com.interfaces.Artista {
    private final String nome;
    private final String biografia;
    private final List<Musica> discografia;
    private final Optional<List<Musica>> musicasMaisTocadas;

    public Artista(String nome, String biografia, List<Musica> discografia, Optional<List<Musica>> musicasMaisTocadas) {
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
    public List<Musica> getDiscografia() {
        return this.discografia;
    }

    @Override
    public Optional<List<Musica>> getMusicasMaisTocadas() {
        return this.musicasMaisTocadas;
    }
}
