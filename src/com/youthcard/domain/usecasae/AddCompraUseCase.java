package com.youthcard.domain.usecasae;

public class AddCompraUseCase {
    private CompraRepository CompraRepository;

    public AddCompraUseCase(AddCompraUseCase repository) {
        this.CompraRepository = CompraRepository;
    }

    public void execute(Compra compra) {
        this.CompraRepository.save(compra);
    }


}