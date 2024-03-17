package com.example.WSHIU.modele.collection;

import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "utilisateur_exposition")
public class Billet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    int id ;

    @Column
    String id_exposition ;
    @Column
    String id_utilisateur ;

    @Column
    Date date_achat ;

    public String getExposition() {
        return id_exposition;
    }
    public int getId() {
        return id;
    }
    public String getUtilisateur() {
        return id_utilisateur;
    }
    public Date getDate_achat() {
        return date_achat;
    }
    public void setExposition(String exposition) {
        this.id_exposition = exposition;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setUtilisateur(String utilisateur) {
        this.id_utilisateur = utilisateur;
    }
    public void setDate_achat(Date date_achat) {
        if (date_achat==null || String.valueOf(date_achat).equals("")) {
            LocalDateTime local = LocalDateTime.now();
            String d = String.valueOf(local);
            date_achat = Date.valueOf(d);
        }
        this.date_achat = date_achat;
    }
    
    public Billet(){}
    public Billet(int id, String id_exposition, String id_utilisateur, Date date_achat) {
        this.id = id;
        this.id_exposition = id_exposition;
        this.id_utilisateur = id_utilisateur;
        this.date_achat = date_achat;
    }



    
    

}
