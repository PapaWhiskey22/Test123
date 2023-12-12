package com.example.recipe.controllers;

import com.example.recipe.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @RequestMapping("/recipes")
    public String index(Model model) {
        model.addAttribute("title", "All Recipes");
        model.addAttribute("recipes", recipeRepository.findAll());
        return "recipe/index";
    }


}
