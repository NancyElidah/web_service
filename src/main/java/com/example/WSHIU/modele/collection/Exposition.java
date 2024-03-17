package com.example.WSHIU.modele.collection;

import java.sql.Timestamp;
import java.util.List;

import com.example.WSHIU.modele.utilisateur.Utilisateur;
import com.example.WSHIU.modele.utility.IdGenerator;

import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.*;

@Entity
@Table
public class Exposition {
    @Id
	@Column
	@GenericGenerator(name = "custom-id", type = IdGenerator.class, parameters = {
			@org.hibernate.annotations.Parameter(name = "prefix", value = "EXP"),
			@org.hibernate.annotations.Parameter(name = "sequence", value = "seq_exposition"),
			@org.hibernate.annotations.Parameter(name = "max_length", value = "7") })
    String id;
    @OneToOne
    @JoinColumn(name = "id_utilisateur")
    Utilisateur utilisateur;
    @Column
    double prix;
    @Column(name = "date_debut")
    Timestamp dateDebut;
    @Column(name = "date_fin")
    Timestamp dateFin;
    @Column
    String description;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "collection_exposition",  
        joinColumns = @JoinColumn(name = "id_exposition"),
        inverseJoinColumns = @JoinColumn(name = "id_collection")
    )
    List<Collection> listeCollection;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public Timestamp getDateDebut() {
        return dateDebut;
    }
    public void setDateDebut(Timestamp dateDebut) {
        this.dateDebut = dateDebut;
    }
    public Timestamp getDateFin() {
        return dateFin;
    }
    public void setDateFin(Timestamp dateFin) {
        this.dateFin = dateFin;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
