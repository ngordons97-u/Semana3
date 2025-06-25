package com.uisrael.gestion_biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uisrael.gestion_biblioteca.entity.Miembro;
import com.uisrael.gestion_biblioteca.repository.MiembroRepository;
import com.uisrael.gestion_biblioteca.service.MiembroService;

@Service
@Transactional
public class MiembroServiceImpl implements MiembroService{

	@Autowired
    private MiembroRepository miembroRepository;
	
	@Override
	public List<Miembro> findAllMiembro() {
		return miembroRepository.findAll();
	}

	@Override
	public Miembro saveMimebro(Miembro mimebro) {
		return miembroRepository.save(mimebro);
	}

	@Override
	public void deleteMember(int id) {
		miembroRepository.deleteById(id);
	}

	@Override
	public Miembro updateMiembro(int id, Miembro detalle) {
		// TODO Auto-generated method stub
		return null;
	}

}
