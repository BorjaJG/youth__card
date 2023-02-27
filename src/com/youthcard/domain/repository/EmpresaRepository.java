package com.youthcard.domain.repository;

import java.util.List;

public interface EmpresaRepository {

    public void save(Empresa compra);

    public Empresa getById(Integer empresaId);

    public void delete(Integer empresaId);

    public List<Empresa> getAll();

    List<Empresa> getAllWithRemote();
}
