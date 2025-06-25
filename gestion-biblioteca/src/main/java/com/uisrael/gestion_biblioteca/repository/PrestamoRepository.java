package com.uisrael.gestion_biblioteca.repository;

import com.uisrael.gestion_biblioteca.entity.Prestamos;
import com.uisrael.gestion_biblioteca.entity.Miembro;
import com.uisrael.gestion_biblioteca.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface PrestamoRepository extends JpaRepository<Prestamos, Integer>{
	List<Prestamos> findByMiembro(Miembro miembro);
	Prestamos findByLibro(Libro libro);
}
