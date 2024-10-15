package com.okayo.facture_service.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nom;

    private double prix_unitaireht;

    @OneToMany(mappedBy = "produit")
    private List<Facture_ligne> lignesFacture;

    private double tauxTVA;

    public Produit() {
    }

    public Produit(String nom, double prix_unitaireht, List<Facture_ligne> lignesFacture, double tauxTVA) {
        this.nom = nom;
        this.prix_unitaireht = prix_unitaireht;
        this.lignesFacture = lignesFacture;
        this.tauxTVA = tauxTVA;
    }

    public Produit(Long id, String nom, double prix_unitaireht, List<Facture_ligne> lignesFacture, double tauxTVA) {
        this.id = id;
        this.nom = nom;
        this.prix_unitaireht = prix_unitaireht;
        this.lignesFacture = lignesFacture;
        this.tauxTVA = tauxTVA;
    }

// Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getprix_unitaireht() {
        return prix_unitaireht;
    }

    public void setprix_unitaireht(double prix_unitaireht) {
        this.prix_unitaireht = prix_unitaireht;
    }

    public List<Facture_ligne> getLignesFacture() {
        return lignesFacture;
    }

    public void setLignesFacture(List<Facture_ligne> lignesFacture) {
        this.lignesFacture = lignesFacture;
    }

    public double getTauxTVA() {
        return tauxTVA;
    }

    public void setTauxTVA(double tauxTVA) {
        this.tauxTVA = tauxTVA;
    }
}
