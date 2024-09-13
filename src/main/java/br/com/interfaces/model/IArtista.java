package br.com.interfaces.model;

import java.util.List;
import java.util.Optional;

public interface IArtista {
    public String getNome();
    public String getBiografia();
    public List<IMusica> getDiscografia();
    Optional<List<IMusica>> getMusicasMaisTocadas();
}
