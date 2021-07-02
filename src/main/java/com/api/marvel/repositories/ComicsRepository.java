package com.api.marvel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.marvel.entities.Comics;

public interface ComicsRepository extends JpaRepository<Comics, Long>{

}
