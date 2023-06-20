package com.example.minitest_3.model;

import jakarta.persistence.*;

import java.util.List;

@Table
@Entity
public class Painting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paintingId;
    private String name ;
    private double weight;
    private double height;
    private String material;
    private double price;



    public Painting() {
    }


    public Painting(Long paintingId, String name, double weight, double height, String material, double price) {
        this.paintingId = paintingId;
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.material = material;
        this.price = price;
    }

    public Long getPaintingId() {
        return paintingId;
    }

    public void setPaintingId(Long paintingId) {
        this.paintingId = paintingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
