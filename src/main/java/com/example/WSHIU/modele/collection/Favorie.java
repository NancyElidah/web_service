package com.example.WSHIU.modele.collection;


import com.example.WSHIU.modele.utilisateur.Utilisateur;

import jakarta.persistence.*;

@Entity
@Table
public class Favorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @OneToOne
    @JoinColumn(name = "id_collection")
    Collection collection;
    @OneToOne
    @JoinColumn(name = "id_utilisateur")
    Utilisateur utilisateur;
    @Column
    int etat;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Collection getCollection() {
        return collection;
    }
    public void setCollection(Collection collection) {
        this.collection = collection;
    }
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    public int getEtat() {
        return etat;
    }
    public void setEtat(int etat) {
        this.etat = etat;
    }
}
