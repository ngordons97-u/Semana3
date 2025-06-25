package com.uisrael.gestion_biblioteca.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "genero")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Genero {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String nombre;

    @ManyToMany(mappedBy = "genero")
    private Set<Libro> libros = new HashSet<>();
}
