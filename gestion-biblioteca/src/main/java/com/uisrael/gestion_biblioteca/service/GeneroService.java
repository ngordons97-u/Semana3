package com.uisrael.gestion_biblioteca.service;

import java.util.List;

import com.uisrael.gestion_biblioteca.entity.Genero;

public interface GeneroService {
    List<Genero> findAllGenero();
    Genero saveGenero(Genero genero);
    void deleteGenero(int id);
    Genero updateGenero(int id, Genero detalles);

}
