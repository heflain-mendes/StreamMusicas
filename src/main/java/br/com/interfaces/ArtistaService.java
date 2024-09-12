package br.com.interfaces;

import java.util.List;
import java.util.Optional;

public interface ArtistaService {
    Optional<List<Musica>> getMusicasMaisTocadas(String artista, ReproducaoService reproducaoService);
    Optional<List<Musica>> getDiscografia(String artista);
    Optional<String> getBiografia(String artista);
    void atualizarEstatisticasReproducao(String artista, ReproducaoService reproducaoService);
}
