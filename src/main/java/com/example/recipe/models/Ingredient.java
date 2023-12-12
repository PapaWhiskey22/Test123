package com.example.recipe.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

// This model is a lot like QUESTION
@Entity
@Table(name="Ingredient")
public class Ingredient extends BaseEntity {

    // Properties
    @NotBlank
    @Size(min=1, max=100)
    private String Name;

    @NotBlank
    private float UnitPrice;

    private int MinQty;
    private int MaxQty;
    // End Properties


    // Constructors

    // End Constructors


    // Methods
    public String GetName() {return this.Name;}
    public void SetName(String name) {this.Name = name;}

    public float GetUnitPrice() {return this.UnitPrice;}
    public void SetUnitPrice(float price) {this.UnitPrice = price;}
    // End Methods
}