package com.okayo.facture_service.controller;

import com.okayo.facture_service.model.Facture;
import com.okayo.facture_service.service.FactureService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/factures")
public class FactureController {

    private final FactureService factureService;

    public FactureController(FactureService factureService) {
        this.factureService = factureService;
    }

    @GetMapping
    public List<Facture> getAllFactures() {
        return factureService.getAllFactures();
    }

    @PostMapping(value = "/factures", consumes = "application/json")
    public ResponseEntity<Facture> createFacture(@RequestBody Facture facture) {
        Facture createdFacture = factureService.createFacture(facture);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdFacture);
    }
}
