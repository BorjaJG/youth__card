package com.youthcard.domain.repository;

import java.util.List;

public interface PromocionRepository {

    public void save(Promocion promocion);

    public Promocion getById(Integer promocionId);

    public void delete(Integer promocionId);

    public List<Promocion> getAll();

    List<Promocion> getAllWithRemote();
}
