package com.example.WSHIU.modele.utilisateur;

import jakarta.persistence.*;
import com.example.WSHIU.modele.utility.IdGenerator;

import java.util.List;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class Utilisateur {
    @Id
	@Column
	@GenericGenerator(name = "custom-id", type = IdGenerator.class, parameters = {
			@org.hibernate.annotations.Parameter(name = "prefix", value = "UT"),
			@org.hibernate.annotations.Parameter(name = "sequence", value = "seq_annonce"),
			@org.hibernate.annotations.Parameter(name = "max_length", value = "7") })
    @GeneratedValue(generator = "custom-id", strategy = GenerationType.IDENTITY)
    String id;
    @Column
    String nom;
    @Column
    String prenom;
    @Column
    String pseudo;
    @Column
    String email;
    @Column(name = "mot_de_passe")
    String motDePasse;
    @Column
    int genre;
    @OneToOne
@JoinColumn(name = "id_role") 
private Role role;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "utilisateur_type_artiste",  
        joinColumns = @JoinColumn(name = "id_utilisateur"),
        inverseJoinColumns = @JoinColumn(name = "id_type_artiste")
    )
    List<TypeArtiste> types;

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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMotDePasse() {
        return motDePasse;
    }
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    public int getGenre() {
        return genre;
    }
    public void setGenre(int genre) {
        this.genre = genre;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    
}
