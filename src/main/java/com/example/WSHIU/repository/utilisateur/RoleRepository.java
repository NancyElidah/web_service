package com.example.WSHIU.repository.utilisateur;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WSHIU.modele.utilisateur.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    
}
