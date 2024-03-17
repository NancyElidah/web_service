package com.example.WSHIU.repository.collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WSHIU.modele.collection.Collection;

public interface CollectionRepository extends JpaRepository<Collection, String> {
    
}
