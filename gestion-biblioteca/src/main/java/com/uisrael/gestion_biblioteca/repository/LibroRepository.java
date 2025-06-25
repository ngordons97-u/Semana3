package com.uisrael.gestion_biblioteca.repository;

import com.uisrael.gestion_biblioteca.entity.Autor;
import com.uisrael.gestion_biblioteca.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface LibroRepository extends JpaRepository<Libro, Integer>{
	List<Libro> findByAutor(Autor autor);
}
