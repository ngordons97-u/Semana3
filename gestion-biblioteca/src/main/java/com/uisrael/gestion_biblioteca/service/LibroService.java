package com.uisrael.gestion_biblioteca.service;

import java.util.List;

import com.uisrael.gestion_biblioteca.entity.Libro;

public interface LibroService {
	List<Libro> findAllLibro();
    Libro saveLibro(Libro book);
    void deleteLibro(Long id);
    Libro updateLibro(Long id, Libro bookDetails);
    Libro returnLibro(int libroId);
}
