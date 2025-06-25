package com.uisrael.gestion_biblioteca.service;

import java.util.List;

import com.uisrael.gestion_biblioteca.entity.Miembro;

public interface MiembroService {
    List<Miembro> findAllMiembro();
    Miembro saveMimebro(Miembro mimebro);
    void deleteMember(int id);
    Miembro updateMiembro(int id, Miembro detalle);
}
