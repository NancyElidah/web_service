package com.example.WSHIU.modele.collection;

import jakarta.persistence.*;

@Entity
@Table
public class Style {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)    int id;
    @Column
    String style;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getStyle() {
        return style;
    }
    public void setStyle(String style) {
        this.style = style;
    }

}
