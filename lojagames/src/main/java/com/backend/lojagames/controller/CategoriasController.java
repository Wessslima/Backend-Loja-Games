package com.backend.lojagames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.lojagames.model.Categorias;
import com.backend.lojagames.repository.CategoriasRepository;

@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriasController {
	
	@Autowired
	private CategoriasRepository categoriasRepository;
	
	@GetMapping
	public ResponseEntity<List<Categorias>> getAll(){
		return ResponseEntity.ok(categoriasRepository.findAll());
	}
}
