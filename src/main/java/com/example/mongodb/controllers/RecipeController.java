package com.example.mongodb.controllers;

import com.example.mongodb.dtos.RecipeRequest;
import com.example.mongodb.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recipes")
public class RecipeController {

    RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/create")
    public String create(ModelMap model) {
        return "createRecipe";
    }

    @PostMapping("/create")
    public String save(@RequestBody RecipeRequest recipeRequest) {
        recipeService.saveRecipe(recipeRequest);
        return "recipes";
    }

}
