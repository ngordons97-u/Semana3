package com.uisrael.gestion_biblioteca.service;

import java.util.List;

import com.uisrael.gestion_biblioteca.entity.Prestamos;

public interface PrestamosService {
    List<Prestamos> findAllPrestamos();
    Prestamos savePrestamos(Prestamos prestamo);
    void deletePrestamos(int id);
    Prestamos updatePrestamos(int id, Prestamos detalle);
}
