package com.uisrael.gestion_biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uisrael.gestion_biblioteca.entity.Editorial;
import com.uisrael.gestion_biblioteca.repository.EditorialRepository;
import com.uisrael.gestion_biblioteca.service.EditorialService;

@Service
@Transactional
public class EditorialServiceImpl implements EditorialService{

	@Autowired
	private EditorialRepository editorialRepository;
	
	@Override
	public List<Editorial> findAllEditorial() {
		return editorialRepository.findAll()
;	}

	@Override
	public Editorial saveEditorial(Editorial editorial) {
		return editorialRepository.save(editorial);
	}

	@Override
	public void deleteEditorial(int id) {
		editorialRepository.deleteById(id);
	}

	@Override
	public Editorial updateEditorial(int id, Editorial detalle) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
