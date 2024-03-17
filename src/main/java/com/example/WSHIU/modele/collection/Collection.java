package com.example.WSHIU.modele.collection;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import com.example.WSHIU.modele.utilisateur.Utilisateur;
import com.example.WSHIU.modele.utility.IdGenerator;

import jakarta.persistence.*;

@Entity
@Table
public class Collection {
    @Id
	@Column
	@GenericGenerator(name = "custom-id", type = IdGenerator.class, parameters = {
			@org.hibernate.annotations.Parameter(name = "prefix", value = "COL"),
			@org.hibernate.annotations.Parameter(name = "sequence", value = "seq_collection"),
			@org.hibernate.annotations.Parameter(name = "max_length", value = "7") })
    @GeneratedValue(generator = "custom-id", strategy = GenerationType.IDENTITY)
    String id;
    @ManyToOne
    @JoinTable(
        name = "utilisateur",  
        joinColumns = @JoinColumn(name = "id_utilisateur")
    )
    Utilisateur utilisateur;
	@Column
    String titre;
	@Column(name = "date_creation")
    Date dateCreation;
    @ManyToOne
    @JoinTable(
        name = "style",  
        joinColumns = @JoinColumn(name = "id_style")
    )
    Style style;
	@Column(name = "contexte_historique")
    String contexteHistorique;
	@Column
    String message;
    @Column
    int status;
    @Column
    int etat;
    @Column
    Timestamp datePublication;
    @Column
    String couleur;
    @OneToMany
    @JoinTable(
        name = "description",  
        joinColumns = @JoinColumn(name = "id_collection")
    )
    List<Description> descriptions;

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
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public Date getDateCreation() {
        return dateCreation;
    }
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    public Style getStyle() {
        return style;
    }
    public void setStyle(Style style) {
        this.style = style;
    }
    public String getContexteHistorique() {
        return contexteHistorique;
    }
    public void setContexteHistorique(String contexteHistorique) {
        this.contexteHistorique = contexteHistorique;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public int getEtat() {
        return etat;
    }
    public void setEtat(int etat) {
        this.etat = etat;
    }
    public Timestamp getDatePublication() {
        return datePublication;
    }
    public void setDatePublication(Timestamp datePublication) {
        this.datePublication = datePublication;
    }
    public String getCouleur() {
        return couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public List<Description> getDescriptions() {
        return descriptions;
    }
    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }
}
