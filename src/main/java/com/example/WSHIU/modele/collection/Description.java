package com.example.WSHIU.modele.collection;

import jakarta.persistence.*;

@Entity
@Table
public class Description {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    int id;
    @OneToOne
    @JoinTable(
        name = "type_description",  
        joinColumns = @JoinColumn(name = "id_type_description")
    )
    TypeDescription typeDescription;
    @OneToOne
    @JoinColumn(name = "id_collection")
    Collection collection;
    @Column
    String description;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public TypeDescription getTypeDescription() {
        return typeDescription;
    }
    public void setTypeDescription(TypeDescription typeDescription) {
        this.typeDescription = typeDescription;
    }
    public Collection getCollection() {
        return collection;
    }
    public void setCollection(Collection collection) {
        this.collection = collection;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
