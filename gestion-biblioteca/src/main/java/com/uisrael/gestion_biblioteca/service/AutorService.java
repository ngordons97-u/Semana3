package com.uisrael.gestion_biblioteca.service;

import java.util.List;

import com.uisrael.gestion_biblioteca.entity.Autor;

public interface AutorService {
    List<Autor> findAllAutor();
    Autor saveAutor(Autor autor);
    void deleteAutor(int id);
    Autor updateAutor(int id, Autor detalle);

}
