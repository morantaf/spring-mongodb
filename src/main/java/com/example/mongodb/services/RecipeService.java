package com.example.mongodb.services;

import com.example.mongodb.dtos.RecipeRequest;
import com.example.mongodb.dtos.RecipeResponse;
import com.example.mongodb.models.Recipe;
import com.example.mongodb.repositories.RecipeRepository;
import com.example.mongodb.services.interfaces.IRecipeService;
import com.example.mongodb.utils.RecipeMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService implements IRecipeService {

    private final RecipeRepository recipeRepository;
    private final RecipeMapper mapper;

    public RecipeService(RecipeRepository recipeRepository, RecipeMapper mapper) {
        this.recipeRepository = recipeRepository;
        this.mapper = mapper;
    }

    public void saveRecipe(RecipeRequest recipeRequest) {
        Recipe recipe = new Recipe(recipeRequest.getName(), recipeRequest.getDescription());
        recipeRepository.save(recipe);
    }

    public List<RecipeResponse> getAll() {
        return mapper.toDtoList(recipeRepository.findAll());
    }


}
