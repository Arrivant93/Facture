package com.okayo.facture_service.repository;

import com.okayo.facture_service.model.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture, Long> {
}
