package com.example.mongodb.utils;

import com.example.mongodb.dtos.RecipeResponse;
import com.example.mongodb.models.Recipe;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RecipeMapper implements Mapper<Recipe, RecipeResponse> {

    public List<RecipeResponse> toDtoList(List<Recipe> recipes) {
        return recipes.stream().map(this::toDto).collect(Collectors.toList());
    }

    @Override
    public RecipeResponse toDto(Recipe recipe) {
        return new RecipeResponse(recipe.getName(), recipe.getDescription());
    }
}
