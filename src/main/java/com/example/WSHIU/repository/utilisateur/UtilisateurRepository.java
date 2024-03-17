package com.example.WSHIU.repository.utilisateur;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WSHIU.modele.utilisateur.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, String> {
    List<Utilisateur> findAllByRoleId(int idRole);
}
