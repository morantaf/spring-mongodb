package com.example.mongodb.controllers;

import com.example.mongodb.dtos.RecipeRequest;
import com.example.mongodb.dtos.RecipeResponse;
import com.example.mongodb.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return "createRecipe";
    }

    @PostMapping("/create")
    public String save(@RequestBody RecipeRequest recipeRequest) {
        recipeService.saveRecipe(recipeRequest);
        return "recipes";
    }

    @GetMapping
    public String getAll(Model model) {
        List<RecipeResponse> recipes = recipeService.getAll();
        model.addAttribute("recipes", recipes);
        return "recipes";
    }

}
