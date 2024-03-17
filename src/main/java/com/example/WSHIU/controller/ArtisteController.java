package com.example.WSHIU.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.WSHIU.modele.collection.Artiste;
import com.example.WSHIU.modele.collection.Billet;
import com.example.WSHIU.repository.collection.BilletRepository;
import com.example.WSHIU.repository.utilisateur.ArtisteRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/artiste")
public class ArtisteController {
    @Autowired
    private BilletRepository billetRes ;

    @Autowired 
    private ArtisteRepository arRepository;

    @PostMapping
    public void saveBillet (@RequestBody Billet billet){
        
        billetRes.save(billet);
        System.out.println(billet.getId());
        System.out.println(billet.getExposition());
        System.out.println(billet.getUtilisateur());
    }
    
    @GetMapping
    public List<Artiste> getAllArtiste(){
        return arRepository.findAll();
    }

    @GetMapping("/id/{id}")
    public List<Artiste> getByIdArtiste(@PathVariable String id) {
        return arRepository.findAllById(id);
    }
    
}