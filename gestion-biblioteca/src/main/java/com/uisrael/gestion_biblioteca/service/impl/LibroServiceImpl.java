package com.uisrael.gestion_biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uisrael.gestion_biblioteca.entity.Libro;
import com.uisrael.gestion_biblioteca.repository.LibroRepository;
import com.uisrael.gestion_biblioteca.service.LibroService;

@Service
@Transactional
public class LibroServiceImpl implements LibroService{

	@Autowired
    private LibroRepository libroRepository;
	
	@Override
	public List<Libro> findAllLibro() {
		return libroRepository.findAll();
	}

	@Override
	public Libro saveLibro(Libro book) {
		return libroRepository.save(book);
	}

	@Override
	public void deleteLibro(int id) {
		libroRepository.deleteById(id);
	}

	@Override
	public Libro updateLibro(int id, Libro bookDetails) {
		// TODO Auto-generated method stub
		return null;
	}

}
