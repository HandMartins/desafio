package com.example.demo.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PaisRepository extends CrudRepository<Pais, Long> {

    Iterable<Pais> findByCapital(String capital);

}
