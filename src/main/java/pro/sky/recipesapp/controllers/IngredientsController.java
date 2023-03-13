package pro.sky.recipesapp.controllers;

import org.springframework.web.bind.annotation.*;
import pro.sky.recipesapp.model.Ingredients;
import pro.sky.recipesapp.model.Recipes;
import pro.sky.recipesapp.services.IngredientsService;
import pro.sky.recipesapp.services.RecipesService;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientsController {
    private final IngredientsService ingredientsService;


    public IngredientsController (@RequestBody IngredientsService ingredientsService){
        this.ingredientsService = ingredientsService;
    }

    @PostMapping
    @ResponseBody
    public void createIngredient( @RequestBody Ingredients ingredient){
        ingredientsService.addIngredient(ingredient);
    }

    @GetMapping("/{id}")
    public  Ingredients getIngredient(@PathVariable long id) {
        return ingredientsService.getIngredient(id);
    }

    @GetMapping
    public Collection<Ingredients> getAllIngredients( ) {
        return ingredientsService.getIngredients();
    }
    @PutMapping("/{id}")
    @ResponseBody
    public Ingredients updateIngredient( @PathVariable long id, @RequestBody Ingredients ingredient){
        return ingredientsService.updateIngredient(id,ingredient);
    }

    @DeleteMapping("/{id}")
    public  Ingredients deleteIngredient(@PathVariable long id) {
        return ingredientsService.deleteIngredient(id);
    }
}
