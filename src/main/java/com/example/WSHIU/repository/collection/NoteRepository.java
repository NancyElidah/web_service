package com.example.WSHIU.repository.collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WSHIU.modele.collection.Note;

public interface NoteRepository extends JpaRepository<Note, Integer> {
    
}
