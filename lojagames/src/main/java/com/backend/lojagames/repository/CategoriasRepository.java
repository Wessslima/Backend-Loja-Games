package com.backend.lojagames.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.lojagames.model.Categorias;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Long> {

}
