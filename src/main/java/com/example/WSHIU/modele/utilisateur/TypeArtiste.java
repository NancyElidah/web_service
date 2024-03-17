package com.example.WSHIU.modele.utilisateur;

import jakarta.persistence.*;

@Entity
@Table(name = "type_artiste")
public class TypeArtiste {
    @Id
    @Column
    int id;
    @Column
    String intitule;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getIntitule() {
        return intitule;
    }
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
}
