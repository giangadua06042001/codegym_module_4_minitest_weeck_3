package com.example.minitest_3.model;

import jakarta.persistence.*;


@Entity
@Table
public class PaintingCatalogDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Catalog catalog;

    @ManyToOne
    private Painting painting;

    public PaintingCatalogDetail(Long id, Catalog catalog, Painting painting) {
        this.id = id;
        this.catalog = catalog;
        this.painting = painting;
    }

    public PaintingCatalogDetail() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public Painting getPainting() {
        return painting;
    }

    public void setPainting(Painting painting) {
        this.painting = painting;
    }
}
