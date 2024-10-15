package com.okayo.facture_service.repository;

import com.okayo.facture_service.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
