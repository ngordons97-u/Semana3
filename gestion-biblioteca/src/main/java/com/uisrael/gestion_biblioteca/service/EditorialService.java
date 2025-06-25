package com.uisrael.gestion_biblioteca.service;

import java.util.List;

import com.uisrael.gestion_biblioteca.entity.Editorial;

public interface EditorialService {
    List<Editorial> findAllEditorial();
    Editorial saveEditorial(Editorial editorial);
    void deleteEditorial(int id);
    Editorial updateEditorial(int id, Editorial detalle);
}
