package com.uisrael.gestion_biblioteca.repository;

import com.uisrael.gestion_biblioteca.entity.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer>{
	Genero findByNombre(String nombre);

}
