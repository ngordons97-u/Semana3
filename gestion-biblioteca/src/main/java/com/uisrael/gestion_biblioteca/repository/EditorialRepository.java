package com.uisrael.gestion_biblioteca.repository;

import com.uisrael.gestion_biblioteca.entity.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialRepository extends JpaRepository<Editorial, Integer> {
	Editorial findByNombre(String nombre);

}
