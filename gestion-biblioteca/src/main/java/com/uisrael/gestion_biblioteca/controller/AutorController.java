package com.uisrael.gestion_biblioteca.controller;

import com.uisrael.gestion_biblioteca.entity.Autor;
import com.uisrael.gestion_biblioteca.repository.AutorRepository;
import com.uisrael.gestion_biblioteca.service.AutorService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/autores")
public class AutorController {
	
	@Autowired
	private AutorService autorService;
	
	
	 // Mostrar la lista de autores
    @GetMapping
    public String listarAutores(Model model) {
        model.addAttribute("listaAutores", autorService.findAllAutor());
        return "lista_autores";
    }
	
    // Mostrar formulario nuevo autor
    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("autor", new Autor());
        return "autor_form";
    }

    // Guardar autor
    @PostMapping("/guardar")
    public String guardarAutor(@Valid @ModelAttribute Autor autor,BindingResult bindingResult, Model model) {
		 if (bindingResult.hasErrors()) {
			 return "autor_form";
		 }
        autorService.saveAutor(autor);
        return "redirect:/autores";
    }
    

   

    @GetMapping("/buscar-nombre")
    public String buscarPorNombre(@RequestParam String nombre, Model model) {
        List<Autor> autores = autorService.buscarPorNombreParcial(nombre);
        model.addAttribute("listaAutores", autores);
        return "lista_autores";
    }

    @GetMapping("/buscar-nacionalidad")
    public String buscarPorNacionalidad(@RequestParam String nacionalidad, Model model) {
        List<Autor> autores = autorService.buscarPorNacionalidad(nacionalidad);
        model.addAttribute("listaAutores", autores);
        return "lista_autores";
    }

    @GetMapping("/buscar-cantidad")
    public String buscarPorCantidadLibros(@RequestParam int cantidad, Model model) {
        List<Autor> autores = autorService.buscarAutoresConMasDe(cantidad);
        model.addAttribute("listaAutores", autores);
        return "lista_autores";
    }

    @GetMapping("/ordenados")
    public String listarOrdenados(Model model) {
        model.addAttribute("listaAutores", autorService.listarAutoresOrdenados());
        return "lista_autores";
    }

    @GetMapping("/con-libros")
    public String listarConLibros(Model model) {
        model.addAttribute("listaAutores", autorService.listarAutoresConLibros());
        return "lista_autores";
    }

	
}


