package pro.sky.recipesapp.controllers;

import org.springframework.web.bind.annotation.*;
import pro.sky.recipesapp.model.Ingredients;
import pro.sky.recipesapp.model.Recipes;
import pro.sky.recipesapp.services.IngredientsService;
import pro.sky.recipesapp.services.RecipesService;
@RestController
@RequestMapping("/ingredients")
public class IngredientsController {
    private final IngredientsService ingredientsService;


    public IngredientsController (@RequestBody IngredientsService ingredientsService){
        this.ingredientsService = ingredientsService;
    }

    @PostMapping("/add")
    @ResponseBody
    public void createRecipe( @RequestBody Ingredients ingredient){
        ingredientsService.addIngredient(ingredient);
    }

    @GetMapping("/get")
    public  Ingredients getRecipe(@RequestParam long recipeNumber) {
        return ingredientsService.getIngredient(recipeNumber);
    }
}
