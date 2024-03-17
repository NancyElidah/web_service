package com.example.WSHIU.repository.collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WSHIU.modele.collection.Commentaire;

public interface CommentaireRepository extends JpaRepository<Commentaire, Integer> {
    
}
