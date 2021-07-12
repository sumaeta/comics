package com.api.marvel.services;

import com.api.marvel.dto.marvel.ComicDataWrapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.api.marvel.entities.Comics;
import com.api.marvel.repositories.ComicsRepository;

import java.util.Optional;

@Service
public class ComicInsert {

	@Autowired
	private ComicsRepository repo;
	@Autowired
	private ComicServiceBuscaId comicServiceBuscaId;

	public Comics save(Integer idRevista) {
		Optional<Comics> optional = this.repo.findByComicId(idRevista);

		if (optional.isEmpty()) {
			ComicDataWrapper comicDataWrapper = this.comicServiceBuscaId.buscarId(idRevista);
			Comics comic = new Comics(
					comicDataWrapper.getData().getResults().get(0).getId(),
					comicDataWrapper.getData().getResults().get(0).getTitle(),
					comicDataWrapper.getData().getResults().get(0).getPrices().get(0).getPrice(),
					comicDataWrapper.getData().getResults().get(0).getCreators().getCollectionURI(),
					comicDataWrapper.getData().getResults().get(0).getIsbn(),
					comicDataWrapper.getData().getResults().get(0).getDescription()
			);

			return this.repo.save(comic);
		}

		throw new IllegalArgumentException("Está revista já se encontra na base de dados");
	}
}
