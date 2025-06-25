package com.uisrael.gestion_biblioteca.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import com.uisrael.gestion_biblioteca.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AutorRepository extends JpaRepository<Autor, Integer>{
	Autor findByNombre(String nombre);
	
	@Query("SELECT a FROM Autor a ORDER BY a.nombre")
    List<Autor> listarAutoresOrdenados();

    @Query("SELECT DISTINCT a FROM Autor a JOIN a.libros l")
    List<Autor> listarAutoresConLibros();

    @Query("SELECT a FROM Autor a WHERE a.nacionalidad = :nacionalidad")
    List<Autor> buscarPorNacionalidad(@Param("nacionalidad") String nacionalidad);

    @Query("SELECT a FROM Autor a WHERE LOWER(a.nombre) LIKE LOWER(CONCAT('%', :nombre, '%'))")
    List<Autor> buscarPorNombreParcial(@Param("nombre") String nombre);

    @Query("SELECT a FROM Autor a WHERE SIZE(a.libros) > :cantidad")
    List<Autor> buscarAutoresConMasDe(@Param("cantidad") int cantidad);
    
    @Query("SELECT a FROM Autor a WHERE LOWER(a.nombre) LIKE LOWER(CONCAT('%', :letra, '%'))")
    List<Autor> buscarAutoresPorLetra(@Param("letra") String letra);
}
