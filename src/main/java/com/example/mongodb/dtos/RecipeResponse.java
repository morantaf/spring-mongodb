package com.example.mongodb.dtos;

public class RecipeResponse {

    private String name;
    private String description;

    public RecipeResponse(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
