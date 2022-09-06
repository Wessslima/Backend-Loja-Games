package com.backend.lojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.backend.lojagames.model.Categorias;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Long> {
	
	public List <Categorias> findAllByPs4ContainingIgnoreCase(@Param("ps4") String ps4);
}
