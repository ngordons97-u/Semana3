package com.uisrael.gestion_biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uisrael.gestion_biblioteca.entity.Genero;
import com.uisrael.gestion_biblioteca.repository.GeneroRepository;
import com.uisrael.gestion_biblioteca.service.GeneroService;

@Service
@Transactional
public class GeneroServiceImpl implements GeneroService{
	
	@Autowired
	private GeneroRepository generoepository;
	
	@Override
	public List<Genero> findAllGenero() {
		return generoepository.findAll()
;	}

	@Override
	public Genero saveGenero(Genero genero) {
		return generoepository.save(genero);
	}

	@Override
	public void deleteGenero(int id) {
		generoepository.deleteById(id);
	}

	@Override
	public Genero updateGenero(int id, Genero detalles) {
		// TODO Auto-generated method stub
		return null;
	}

}
