package com.api.marvel.services;

import com.api.marvel.dto.ComicDTOResponse;
import com.api.marvel.dto.UsuarioComicsDTOResponse;
import com.api.marvel.dto.UsuarioDTOResponse;
import com.api.marvel.entities.Comics;
import com.api.marvel.entities.Usuario;
import com.api.marvel.repositories.ComicsRepository;
import com.api.marvel.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ListaUsuarioComicsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ComicsRepository comicsRepository;

    public UsuarioComicsDTOResponse listaComicsDoUsuario(Long id, List<Integer> idComics) {

        Optional<Usuario> optionalUsuario = this.usuarioRepository.findById(id);

        List<ComicDTOResponse> comics = new ArrayList<>();

        idComics.forEach(comicId -> {
            Optional<Comics> optionalComic = comicsRepository.findByComicId(comicId);

            if (optionalComic.isEmpty()) {
                throw new IllegalArgumentException("Comic com ID "+comicId+" não foi cadastrado");
            }

            comics.add(new ComicDTOResponse(optionalComic.get()));
        });

        if (optionalUsuario.isEmpty()) {
            throw new IllegalArgumentException("Usuário não cadastro");
        }

        return new UsuarioComicsDTOResponse(
                new UsuarioDTOResponse(optionalUsuario.get()),
                comics
        );
    }
}
