package br.com.interfaces.repository;

import br.com.interfaces.model.IMusica;

import java.util.List;
import java.util.Optional;

public interface IMusicaRepository {
    public Optional<List<IMusica>> getMusicasMaisTocadas(String nomeArtista, int qtd);
    public Optional<List<IMusica>> getMusicas(String nomeArtista);
}
