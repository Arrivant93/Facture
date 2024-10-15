package com.okayo.facture_service.service;

import com.okayo.facture_service.model.Facture;
import com.okayo.facture_service.repository.FactureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactureService {

    private final FactureRepository factureRepository;

    public FactureService(FactureRepository factureRepository) {
        this.factureRepository = factureRepository;
    }

    public List<Facture> getAllFactures() {
        return factureRepository.findAll();
    }

    public Facture createFacture(Facture facture) {
        return factureRepository.save(facture);
    }
}
