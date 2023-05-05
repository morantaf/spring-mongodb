package com.example.mongodb.services.interfaces;

import com.example.mongodb.dtos.RecipeRequest;
import com.example.mongodb.dtos.RecipeResponse;

import java.util.List;

public interface IRecipeService {

    void saveRecipe(RecipeRequest recipeRequest);

    List<RecipeResponse> getAll();
}
