package com.example.WSHIU.repository.utilisateur;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WSHIU.modele.collection.Artiste;

public interface ArtisteRepository extends JpaRepository<Artiste , String> {
    List<Artiste> findAllById(String id);
}
