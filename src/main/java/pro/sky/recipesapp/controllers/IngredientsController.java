package pro.sky.recipesapp.controllers;

import org.springframework.web.bind.annotation.*;
import pro.sky.recipesapp.model.Ingredients;
import pro.sky.recipesapp.model.Recipes;
import pro.sky.recipesapp.services.IngredientsService;
import pro.sky.recipesapp.services.RecipesService;

public class IngredientsController {
    private IngredientsService ingredientsService;


    public IngredientsController (IngredientsService ingredientsService){
        this.ingredientsService = ingredientsService;
    }

    @PostMapping("/add")
    public void createRecipe( Ingredients ingredient){
        ingredientsService.addIngredient(ingredient);
    }

    @GetMapping("/get")
    public  Recipes getRecipe(@RequestParam long recipeNumber) {
        return ingredientsService.getIngredient(recipeNumber);
    }
}
