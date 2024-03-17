package com.example.WSHIU.repository.utilisateur;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.WSHIU.modele.utilisateur.TypeArtiste;

public interface TypeArtisteRepository extends JpaRepository<TypeArtiste, Integer> {
    
}
