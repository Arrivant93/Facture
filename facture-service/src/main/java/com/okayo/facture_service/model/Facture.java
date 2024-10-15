package com.okayo.facture_service.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String reference;

    private String date_facturation;
    private String date_echeance;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    @JsonManagedReference // Sérialise cette relation
    private Client client;

    @OneToMany(mappedBy = "facture", cascade = CascadeType.ALL)
    private List<Facture_ligne> lignes;

    private double totalHT;
    private double totalTTC;

    public Facture() {

    }

    public Facture(String reference, String date_facturation, String date_echeance, Client client, List<Facture_ligne> lignes, double totalHT, double totalTTC) {
        this.reference = reference;
        this.date_facturation = date_facturation;
        this.date_echeance = date_echeance;
        this.client = client;
        this.lignes = lignes;
        this.totalHT = totalHT;
        this.totalTTC = totalTTC;
    }

    public Facture(Long id, String reference, String date_facturation, String date_echeance, Client client, List<Facture_ligne> lignes, double totalHT, double totalTTC) {
        this.id = id;
        this.reference = reference;
        this.date_facturation = date_facturation;
        this.date_echeance = date_echeance;
        this.client = client;
        this.lignes = lignes;
        this.totalHT = totalHT;
        this.totalTTC = totalTTC;
    }
// Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getdate_facturation() {
        return date_facturation;
    }

    public void setdate_facturation(String date_facturation) {
        this.date_facturation = date_facturation;
    }

    public String getdate_echeance() {
        return date_echeance;
    }

    public void setdate_echeance(String date_echeance) {
        this.date_echeance = date_echeance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Facture_ligne> getLignes() {
        return lignes;
    }

    public void setLignes(List<Facture_ligne> lignes) {
        this.lignes = lignes;
    }

    public double getTotalHT() {
        return totalHT;
    }

    public void setTotalHT(double totalHT) {
        this.totalHT = totalHT;
    }

    public double getTotalTTC() {
        return totalTTC;
    }

    public void setTotalTTC(double totalTTC) {
        this.totalTTC = totalTTC;
    }
}
