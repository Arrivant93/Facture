package com.okayo.facture_service.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String code_client;

    private String nom;
    private String adresse;

    @OneToMany(mappedBy = "client")
    @JsonBackReference // Empêche la sérialisation récursive
    private List<Facture> factures;

    public Client() {

    }
    public Client(String code_client, String nom, String adresse, List<Facture> factures) {
        this.code_client = code_client;
        this.nom = nom;
        this.adresse = adresse;
        this.factures = factures;
    }
    public Client(Long id, String code_client, String nom, String adresse, List<Facture> factures) {
        this.id = id;
        this.code_client = code_client;
        this.nom = nom;
        this.adresse = adresse;
        this.factures = factures;
    }
// Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getcode_client() {
        return code_client;
    }

    public void setcode_client(String code_client) {
        this.code_client = code_client;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Facture> getFactures() {
        return factures;
    }

    public void setFactures(List<Facture> factures) {
        this.factures = factures;
    }


}
