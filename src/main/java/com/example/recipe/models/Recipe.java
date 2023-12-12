package com.example.recipe.models;

import com.example.recipe.helpers.RecipeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

// This model is a lot like QUIZ
@Entity
@Table(name="Recipe")
public class Recipe extends BaseEntity {

    // Properties
    @NotBlank
    @Size(min=1, max=100)
    private String Name;

    @NotBlank
    @Size(min=1, max=1000)
    private String Description;

    @NotBlank
    private float Price;

    private RecipeType RecipeType;

    @NotNull
    @ManyToMany
    private List<Ingredient> Ingredients;
    // End Properties


    // Constructors

    // End Constructors


    // Methods
    public String getName() {return this.Name;}
    public void setName(String name) {this.Name = name;}

    public String setDescription(){return this.Description;}
    public void setDescription(String desc){this.Description = desc;}

    public float GetPrice() {return this.Price;}
    public void SetPrice(float price) {this.Price = price;}

    public RecipeType getRecipeType() {return this.RecipeType;}
    public void setRecipeType(RecipeType recipeType) {this.RecipeType = recipeType;}

    public List<Ingredient> getIngredients() {return this.Ingredients;}
    public void setIngredients(List<Ingredient> ingredients) {this.Ingredients = ingredients;}
    // End Methods
}
