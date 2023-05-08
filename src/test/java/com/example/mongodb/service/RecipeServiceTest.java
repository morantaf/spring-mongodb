package com.example.mongodb.service;

import com.example.mongodb.dtos.RecipeRequest;
import com.example.mongodb.models.Recipe;
import com.example.mongodb.repositories.RecipeRepository;
import com.example.mongodb.services.RecipeService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class RecipeServiceTest {

    @Mock
    private RecipeRepository recipeRepository;

    @InjectMocks
    private RecipeService recipeService;

    @Test
    @DisplayName(value = "Save new recipe properly calls repository")
    void saveNewRecipe() {
        //given
        RecipeRequest recipeRequest = new RecipeRequest("Sweet Salmon", "Best salmon in the world");

        // when
        recipeService.saveRecipe(recipeRequest);

        // then
        verify(recipeRepository, times(1)).save(any(Recipe.class));
    }
}
