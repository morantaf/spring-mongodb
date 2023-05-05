package com.example.mongodb.controllers;

import com.example.mongodb.dtos.RecipeRequest;
import com.example.mongodb.dtos.RecipeResponse;
import com.example.mongodb.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/recipes")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/create")
    public String create(ModelMap model) {
        model.addAttribute("recipe",new RecipeRequest());
        return "createRecipe";
    }

    @PostMapping("/create")
    public String recipeSubmit(@ModelAttribute RecipeRequest recipe, Model model) {
        recipeService.saveRecipe(recipe);
        List<RecipeResponse> recipes = recipeService.getAll();
        model.addAttribute("recipes", recipes);
        return "recipes";
    }

    @GetMapping
    public String getAll(Model model) {
        List<RecipeResponse> recipes = recipeService.getAll();
        model.addAttribute("recipes", recipes);
        return "recipes";
    }

}
