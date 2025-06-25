package com.uisrael.gestion_biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.gestion_biblioteca.entity.Autor;
import com.uisrael.gestion_biblioteca.service.AutorService;

@RestController
@RequestMapping("/autor")
public class AutorController {
	
	@Autowired
	private AutorService autorService;
	
	@GetMapping
	public List<Autor> getAllAutor(){
		return autorService.findAllAutor();
	}
	
}
