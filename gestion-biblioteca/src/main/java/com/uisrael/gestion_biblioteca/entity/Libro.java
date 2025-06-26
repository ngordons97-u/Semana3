package com.uisrael.gestion_biblioteca.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "libros")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Libro {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	@NotBlank(message = "* El campo titulo no puede estar vacío.")
	@Pattern(regexp = "^[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ\\s]+$", message = "* El campo titulo solo puede contener letras y espacios.")
    @Column(nullable = false)
    private String titulo;
	@NotBlank(message = "* El identificador no puede estar vacío.")
    @Pattern(regexp = "^[0-9]{13}$", message = "* El identificador debe contener exactamente 13 dígitos numéricos.")
    @Column(nullable = false, unique = true)
    private String isbn;

	@NotNull(message = "* El Autor no puede estar vacío.")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_id", nullable = false)
    private Autor autor;
	@NotNull(message = "* El editorial no puede estar vacío.")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "editorial_id", nullable = false)
    private Editorial editorial;

    @ManyToMany
    @JoinTable(
        name = "book_genres",
        joinColumns = @JoinColumn(name = "libro_id"),
        inverseJoinColumns = @JoinColumn(name = "genero_id")
    )
    private Set<Genero> genero = new HashSet<>();

    @OneToMany(mappedBy = "libro", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Prestamos> prestamos = new HashSet<>();
}
