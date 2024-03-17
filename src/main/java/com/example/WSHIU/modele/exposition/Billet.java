package com.example.WSHIU.modele.exposition;

import java.sql.Date;
import java.time.LocalDateTime;

import com.example.WSHIU.modele.utilisateur.Utilisateur;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "utilisateur_exposition")
public class Billet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    int id ;

    @ManyToMany
    @JoinTable (name = "exposition" , 
                joinColumns = @JoinColumn(name = "id_exposition"))
    Exposition exposition ;

    @ManyToMany
    @JoinTable (name = "utilisateur" , 
                joinColumns =   @JoinColumn(name = "id_utilisateur"))
    Utilisateur utilisateur ;

    @Column
    Date date_achat ;

    public Exposition getExposition() {
        return exposition;
    }
    public int getId() {
        return id;
    }
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }
    public Date getDate_achat() {
        return date_achat;
    }
    public void setExposition(Exposition exposition) {
        this.exposition = exposition;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    public void setDate_achat(Date date_achat) {
        if (date_achat==null || String.valueOf(date_achat).equals("")) {
            LocalDateTime local = LocalDateTime.now();
            String d = String.valueOf(local);
            date_achat = Date.valueOf(d);
        }
        this.date_achat = date_achat;
    }

    public Billet(int id, Exposition exposition, Utilisateur utilisateur,Date date_achat) {
        this.setId(id);
        this.setExposition(exposition);
        this.setUtilisateur(utilisateur);
        this.setDate_achat(date_achat);
    }
    
    public Billet(){}



    
    

}
