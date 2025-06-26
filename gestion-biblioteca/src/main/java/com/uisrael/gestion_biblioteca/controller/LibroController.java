package com.uisrael.gestion_biblioteca.controller;

import com.uisrael.gestion_biblioteca.entity.Libro;
import com.uisrael.gestion_biblioteca.service.AutorService;
import com.uisrael.gestion_biblioteca.service.EditorialService;
import com.uisrael.gestion_biblioteca.service.LibroService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;
    @Autowired
    private AutorService autorService;
    @Autowired
    private EditorialService editorialService;

    // Mostrar todos los libros
    @GetMapping
    public String listarLibros(Model model) {
        List<Libro> listaLibros = libroService.findAllLibro();
        model.addAttribute("listaLibros", listaLibros);
       
        return "lista_libros";
    }

    // Mostrar formulario para nuevo libro
    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("libro", new Libro());
        model.addAttribute("listaAutores", autorService.findAllAutor());
        model.addAttribute("listaEditoriales", editorialService.findAllEditorial());
       // model.addAttribute(listaEditorial, autorService)
        return "libro_form";
    }

    // Guardar libro (nuevo o editado)
    @PostMapping("/guardar")
    public String guardarLibro(@Valid @ModelAttribute Libro libro,BindingResult bindingResult, Model model) {
		 if (bindingResult.hasErrors()) {
			 return "libro_form";
		 }
        libroService.saveLibro(libro);
        return "redirect:/libros";
    }

    // Eliminar libro
    @GetMapping("/eliminar/{id}")
    public String eliminarLibro(@PathVariable int id) {
        libroService.deleteLibro(id);
        return "redirect:/libros";
    }

    //  Mostrar formulario para editar libro
    @GetMapping("/editar/{id}")
    public String editarLibro(@PathVariable int id, Model model) {
        Libro libro = libroService.findAllLibro()
                .stream()
                .filter(l -> l.getId() == id)
                .findFirst()
                .orElse(null);

        if (libro != null) {
            model.addAttribute("libro", libro);
            return "libro_form";
        } else {
            return "redirect:/libros";
        }
    }
}
