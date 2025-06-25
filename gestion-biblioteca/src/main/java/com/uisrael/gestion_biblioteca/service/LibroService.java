package com.uisrael.gestion_biblioteca.service;

import java.util.List;

import com.uisrael.gestion_biblioteca.entity.Libro;

public interface LibroService {
	List<Libro> findAllLibro();
    Libro saveLibro(Libro libro);
    void deleteLibro(int id);
    Libro updateLibro(int id, Libro bookDetails);
}
