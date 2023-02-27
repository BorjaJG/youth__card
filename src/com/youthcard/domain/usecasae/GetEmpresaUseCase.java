package com.youthcard.domain.usecasae;

public class GetEmpresaUseCase {
    private EmpresaRepository empresaRepository;

    public GetEmpresaUseCase(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public List<empresa> execute() {
        return this.empresaRepository.getAll();
    }
}
