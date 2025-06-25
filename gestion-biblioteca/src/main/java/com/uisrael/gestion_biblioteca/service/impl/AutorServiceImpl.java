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

	@Override
	public List<Autor> buscarPorNacionalidad(String nacionalidad) {
		// TODO Auto-generated method stub
		return autorRepository.buscarPorNacionalidad(nacionalidad);
	}

	@Override
	public List<Autor> buscarPorNombreParcial(String nombre) {
		// TODO Auto-generated method stub
		 return autorRepository.buscarPorNombreParcial(nombre);
	}

	@Override
	public List<Autor> buscarAutoresConMasDe(int cantidad) {
		// TODO Auto-generated method stub
		 return autorRepository.buscarAutoresConMasDe(cantidad);
	}

	@Override
	public List<Autor> listarAutoresConLibros() {
		// TODO Auto-generated method stub
		 return autorRepository.listarAutoresConLibros();
	}

	@Override
	public List<Autor> listarAutoresOrdenados() {
		// TODO Auto-generated method stub
		 return autorRepository.listarAutoresOrdenados();
	}

	@Override
	public List<Autor> buscarAutoresPorLetra(String letra) {
		// TODO Auto-generated method stub
		 return autorRepository.buscarAutoresPorLetra(letra);
	}

}
