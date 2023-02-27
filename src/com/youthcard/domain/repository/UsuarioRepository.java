package com.youthcard.domain.repository;

import java.util.List;

public interface UsuarioRepository {

    public void save(Usuario usuario);

    public Usuario getById(Integer usuarioId);

    public void delete(Integer usuarioId);

    public List<Usuario> getAll();

    List<Usuario> getAllWithRemote();
}
