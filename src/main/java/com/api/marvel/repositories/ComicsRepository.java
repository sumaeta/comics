package com.api.marvel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.marvel.entities.Comics;

import java.util.List;
import java.util.Optional;

public interface ComicsRepository extends JpaRepository<Comics, Long>{

    Optional<Comics> findByComicId(Integer idRevista);
}
