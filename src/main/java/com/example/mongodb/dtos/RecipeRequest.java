package com.example.mongodb.dtos;

public class RecipeRequest {

    private String name;
    private String description;

    public RecipeRequest(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public RecipeRequest() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
