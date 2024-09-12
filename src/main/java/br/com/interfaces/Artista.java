package br.com.interfaces;

import java.util.List;
import java.util.Optional;

public interface Artista {
    public String getNome();
    public String getBiografia();
    public List<Musica> getDiscografia();
    Optional<List<Musica>> getMusicasMaisTocadas();
}
