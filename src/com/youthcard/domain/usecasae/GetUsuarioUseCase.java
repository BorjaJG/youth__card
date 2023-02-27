package com.youthcard.domain.usecasae;

public class GetUsuarioUseCase {
    private UsuarioRepository usuarioRepository;

    public GetUsuarioUseCase(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<usuario> execute() {
        return this.usuarioRepository.getAll();
    }
}
