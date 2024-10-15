package com.okayo.facture_service.model;

import jakarta.persistence.*;

@Entity
public class Facture_ligne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "facture_id", nullable = false)
    private Facture facture;

    @ManyToOne
    @JoinColumn(name = "produit_id", nullable = false)
    private Produit produit;

    private int quantite;
    private double prix_unitaireht;
    private double tva;
    private double totalHT;

    public Facture_ligne() {

    }

    public Facture_ligne(Facture facture, Produit produit, int quantite, double prix_unitaireht, double tva, double totalHT) {
        this.facture = facture;
        this.produit = produit;
        this.quantite = quantite;
        this.prix_unitaireht = prix_unitaireht;
        this.tva = tva;
        this.totalHT = totalHT;
    }

    public Facture_ligne(Long id, Facture facture, Produit produit, int quantite, double prix_unitaireht, double tva, double totalHT) {
        this.id = id;
        this.facture = facture;
        this.produit = produit;
        this.quantite = quantite;
        this.prix_unitaireht = prix_unitaireht;
        this.tva = tva;
        this.totalHT = totalHT;
    }
// Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getprix_unitaireht() {
        return prix_unitaireht;
    }

    public void setprix_unitaireht(double prix_unitaireht) {
        this.prix_unitaireht = prix_unitaireht;
    }

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }

    public double getTotalHT() {
        return totalHT;
    }

    public void setTotalHT(double totalHT) {
        this.totalHT = totalHT;
    }
}
