package com.example.minitest_3.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Catalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long catalogId;
    private String name;

    public Catalog() {
    }


    public Catalog(Long catalogId, String name) {
        this.catalogId = catalogId;
        this.name = name;
    }

    public Long getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Long id) {
        this.catalogId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
