package com.youthcard.domain.usecasae;

import com.iesam.youthcard.domain.models.Usuario;

public class AddUsurarioUseCase {
    private UsuarioRepository UsuarioRepository;

    public AddUsurarioUseCase(AddUsurarioUseCase repository) {
        this.UsuarioRepository = UsuarioRepository;
    }

    public void execute(Usuario usuario) {
        this.UsuarioRepository.save(Usuario);
    }


}
