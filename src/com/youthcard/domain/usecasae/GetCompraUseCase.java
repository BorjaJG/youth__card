package com.youthcard.domain.usecasae;

public class GetCompraUseCase {
    private CompraRepository compraRepository;

    public GetCompraUseCase(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }

    public List<compra> execute() {
        return this.compraRepository.getAll();
    }
}
