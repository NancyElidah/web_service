package com.example.WSHIU.modele.collection;

import com.example.WSHIU.modele.utilisateur.Utilisateur;

import jakarta.persistence.*;

@Entity
@Table
public class Commentaire {
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
    String commentaire;
    @Column
    int type;

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

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
