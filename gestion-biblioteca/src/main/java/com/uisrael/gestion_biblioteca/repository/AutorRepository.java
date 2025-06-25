package com.uisrael.gestion_biblioteca.repository;

import com.uisrael.gestion_biblioteca.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AutorRepository extends JpaRepository<Autor, Integer>{
	Autor findByName(String nombre);
}
