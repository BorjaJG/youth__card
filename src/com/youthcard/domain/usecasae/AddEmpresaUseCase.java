package com.youthcard.domain.usecasae;

import com.iesam.youthcard.domain.models.Empresa;

public class AddEmpresaUseCase {

    private EmpresaRepository empresaRepository;

    public AddPersonUseCase(EmpresaRepository empresaRepository) {
        this.EmpresaRepository = EmpresaRepository;
    }

    public void execute(Empresa empresa) {
        this.EmpresaRepository.save(person);
    }

}

