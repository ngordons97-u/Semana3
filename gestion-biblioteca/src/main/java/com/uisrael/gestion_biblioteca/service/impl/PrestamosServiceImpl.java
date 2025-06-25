package com.uisrael.gestion_biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uisrael.gestion_biblioteca.entity.Prestamos;
import com.uisrael.gestion_biblioteca.repository.PrestamoRepository;
import com.uisrael.gestion_biblioteca.service.PrestamosService;

@Service
@Transactional
public class PrestamosServiceImpl implements PrestamosService {

	@Autowired
	private PrestamoRepository prestamoRepository;
	
	@Override
	public List<Prestamos> findAllPrestamos() {
		return prestamoRepository.findAll();
	}

	@Override
	public Prestamos savePrestamos(Prestamos prestamo) {
		return prestamoRepository.save(prestamo);
	}

	@Override
	public void deletePrestamos(int id) {
		prestamoRepository.deleteById(id);
	}

	@Override
	public Prestamos updatePrestamos(int id, Prestamos detalle) {
		// TODO Auto-generated method stub
		return null;
	}

}
