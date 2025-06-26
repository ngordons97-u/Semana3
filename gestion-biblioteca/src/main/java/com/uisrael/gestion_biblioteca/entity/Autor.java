package com.uisrael.gestion_biblioteca.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "autores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Autor {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	@NotBlank(message = "* El campo nombre no puede estar vacío.")
	@Pattern(regexp = "^[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ\\s]+$", message = "* El campo nombre solo puede contener letras y espacios.")
    @Column(nullable = false)
    private String nombre;
	@NotBlank(message = "* El campo nacionalidad no puede estar vacío.")
	@Pattern(regexp = "^[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ\\s]+$", message = "* El campo nacionalidad solo puede contener letras y espacios.")
    @Column(nullable = false)
    private String nacionalidad;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Libro> libros = new HashSet<>();

}
