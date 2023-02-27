package com.youthcard.domain.repository;

import java.util.List;

public interface CompraRepository{

    public void save(Compra compra);

    public Compra getById(Integer compraId);

    public void delete(Integer compraId);

    public List<Compra> getAll();

    List<Compra> getAllWithRemote();
}