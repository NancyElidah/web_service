package com.example.WSHIU.modele.collection;

import org.hibernate.annotations.Immutable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "v_info_artiste")
@Immutable
public class Artiste {
    @Id
    @Column 
    String id ;
    @Column 
    String nom ;
    @Column 
    String prenom ;
    @Column 
    String pseudo ;
    @Column 
    String motDePasse ;
    @Column 
    String email ;
    @Column 
    int genre ;
    @Column 
    String bio ;
    @Column(name = "id_role")
    int role ;
    @Column 
    int id_type_artiste ; 
    @Column 
    String intitule ;
    @Column 
    int note ;
    @Column 
    int nombre_element ;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getPseudo() {
        return pseudo;
    }
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    public String getMotDePasse() {
        return motDePasse;
    }
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getGenre() {
        return genre;
    }
    public void setGenre(int genre) {
        this.genre = genre;
    }
    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }
    public int getRole() {
        return role;
    }
    public void setRole(int role) {
        this.role = role;
    }
    public int getId_type_artiste() {
        return id_type_artiste;
    }
    public void setId_type_artiste(int id_type_artiste) {
        this.id_type_artiste = id_type_artiste;
    }
    public String getIntitule() {
        return intitule;
    }
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    public int getNote() {
        return note;
    }
    public void setNote(int note) {
        this.note = note;
    }
    public Artiste(String id, String nom, String prenom, String pseudo, String motDePasse, String email, int genre,
            String bio, int role, int id_type_artiste, String intitule, int note , int nombre_element) {
        this.setId(id);
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setPseudo(pseudo);
        this.setMotDePasse(motDePasse);
        this.setEmail(email);
        this.setGenre(genre);
        this.setBio(bio);
        this.setRole(role);
        this.setId_type_artiste(id_type_artiste);
        this.setIntitule(intitule);
        this.setNote(note);
        this.setNombre_element(nombre_element);
    }

    public Artiste(){}
    public int getNombre_element() {
        return nombre_element;
    }
    public void setNombre_element(int nombre_element) {
        this.nombre_element = nombre_element;
    }
    
}
