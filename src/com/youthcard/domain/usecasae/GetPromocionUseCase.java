package com.youthcard.domain.usecasae;

public class GetPromocionUseCase {
    private PromocionRepository promocionRepository;

    public GetPromocionUseCase(PromocionRepository promocionRepository) {
        this.promocionRepository = promocionRepository;
    }

    public List<promocion> execute() {
        return this.promocionRepository.getAll();
    }
}
