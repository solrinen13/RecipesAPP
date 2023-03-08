package pro.sky.recipesapp.controllers;

import org.springframework.web.bind.annotation.*;
import pro.sky.recipesapp.model.Recipes;
import pro.sky.recipesapp.services.RecipesService;
import pro.sky.recipesapp.services.impl.RecipesServiceImpl;

import java.util.Map;

@RestController
@RequestMapping("/recipe")
public class RecipesController {
    private RecipesService recipesService;


    public RecipesController ( RecipesService recipesService){
        this.recipesService = recipesService;
    }

   @PostMapping("/add")
   public void createRecipe ( Recipes recipes){
       recipesService.addRecipes(recipes);
    }

   @GetMapping("/get")
    public  Recipes getRecipe(@RequestParam long recipeNumber) {
        return recipesService.getRecipe(recipeNumber);
    }
}
