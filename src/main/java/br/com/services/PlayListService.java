package br.com.services;

import java.util.List;
import java.util.Optional;

import br.com.interfaces.model.IMusica;
import br.com.interfaces.model.IPlaylist;
import br.com.interfaces.model.IUsuario;
import br.com.interfaces.services.IPlayListService;
import br.com.interfaces.services.IRecomendacaoService;
import br.com.interfaces.services.IReproducaoService;
import br.com.interfaces.services.IUsuarioService;
import br.com.model.Playlist;
import java.util.ArrayList;

public class PlayListService implements IPlayListService {
    
    private IRecomendacaoService recomendacaoService;
    private IUsuarioService usuarioService;
    private List<IUsuario> autorizadosParaCriarPlaylist;
    private static final Integer MAX_COLABORADORES = 15;
    
    public PlayListService() {
        autorizadosParaCriarPlaylist = new ArrayList<IUsuario>();
    }

    @Override
    public Optional<IPlaylist> criarPlayList( String nome, IUsuario criador ) {
        
        if( nome == null || nome.isEmpty() ) {
            return Optional.empty();
        }
        
        if( !criador.getPermissaoCriarPlaylists() ) {
            return Optional.empty();
        }

        IPlaylist playlist = new Playlist( nome, criador );
        playlist.adicionarColaborador( criador );

        return Optional.of( playlist );
    }

    @Override
    public Integer compartilharPlayList( IPlaylist playlist, IUsuario usuario ) {
        
        if( !usuarioService.possuiCadastro( usuario ) ) {
            return -1;
        }
        else if( !playlist.isPublica() ) {
            return -2;
        }
        
        return 0;
    }

    @Override
    public Integer convidarColaborador( IPlaylist playlist, IUsuario usuario ) {
        
        if( playlist.getColaboradores().contains( usuario ) ) {
            return -1;
        }
        
        if( playlist.getColaboradores().size() >= MAX_COLABORADORES ) {
            return -2;
        }
        
        playlist.adicionarColaborador( usuario );
        return 0;
    }

    @Override
    public List<IMusica> recomendarMusicasParaPlayList( IPlaylist playlist ) {
        return recomendacaoService.recomendarMusicasParaPlayList( playlist );
    }

    @Override
    public Integer iniciarReproducaoPlayList(
            IPlaylist playlist,
            IUsuario usuario,
            IReproducaoService reproducaoService ) {
        
        if( !usuario.getPermissaoReproduzirMusicas() ) {
            return -1;
        }
        
        if( playlist.getMusicas().isEmpty() ) {
            return -2;
        }
        
        // Verificar a importância de ArtistaService, nenhum lugar do documento
        // fala isso. Por enquanto vamos passá-la como 'null'
        reproducaoService.reproduzirPlayList(playlist, usuario, null);
        return 0;
    }
}
