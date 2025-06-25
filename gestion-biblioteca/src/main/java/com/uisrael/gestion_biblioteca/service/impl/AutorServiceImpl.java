package com.uisrael.gestion_biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.gestion_biblioteca.entity.Autor;
import com.uisrael.gestion_biblioteca.repository.AutorRepository;
import com.uisrael.gestion_biblioteca.service.AutorService;

import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AutorServiceImpl implements AutorService{

	@Autowired
    private AutorRepository autorRepository;
	
	@Override
	public List<Autor> findAllAutor() {
		return autorRepository.findAll();
	}

	@Override
	public Autor saveAutor(Autor autor) {
		return autorRepository.save(autor);
	}

	@Override
	public void deleteAutor(int id) {
		autorRepository.deleteById(id);
	}

	@Override
	public Autor updateAutor(int id, Autor detalle) {
        Autor autor = autorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Autor no encoentrado :: " + id));
        
        return autorRepository.save(autor);
	}

}
