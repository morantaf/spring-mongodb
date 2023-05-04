package com.example.mongodb.services;

import com.example.mongodb.dtos.RecipeRequest;
import com.example.mongodb.models.Recipe;
import com.example.mongodb.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public void saveRecipe(RecipeRequest recipeRequest) {
        Recipe recipe = new Recipe(recipeRequest.getName(), recipeRequest.getDescription());
        recipeRepository.save(recipe);

    }
}
