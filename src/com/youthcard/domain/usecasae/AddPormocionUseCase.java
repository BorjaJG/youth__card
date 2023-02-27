package com.youthcard.domain.usecasae;

import com.iesam.youthcard.domain.models.Promocion;
import com.iesam.youthcard.domain.repository.PromocionRepository;

public class AddPormocionUseCase {
    private PromocionRepository promocionRepository;

    public AddPormocionUseCase(AddPormocionUseCase repository) {
        this.PromocionRepository = PromocionRepository;
    }

    public void execute(Promocion promocion) {
        this.PromocionRepository.save(promocion);
    }
}
