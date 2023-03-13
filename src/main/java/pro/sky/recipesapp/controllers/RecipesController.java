package pro.sky.recipesapp.controllers;

import org.springframework.web.bind.annotation.*;
import pro.sky.recipesapp.model.Recipes;
import pro.sky.recipesapp.services.RecipesService;


import java.util.Collection;


import static pro.sky.recipesapp.services.impl.RecipesServiceImpl.getLastId;

@RestController
@RequestMapping("/recipe")
public class RecipesController {
    private final RecipesService recipesService;



    public RecipesController (@RequestBody RecipesService recipesService){
        this.recipesService = recipesService;
    }


    @PostMapping
    @ResponseBody
    public String createRecipe (@RequestBody Recipes recipes){
        recipesService.addRecipes(recipes);
        return "Рецепт был создан и его айди = " + getLastId();

    }

    @GetMapping("/{id}")
    public Recipes getRecipe(@PathVariable long id) {
        return recipesService.getRecipe(id);
    }

    @GetMapping
    public Collection<Recipes> getAllrecipes( ) {
        return recipesService.getRecipes();
    }
    @PutMapping("/{id}")
    @ResponseBody
    public Recipes updateIngredient( @PathVariable long id, @RequestBody Recipes ingredient){
        return recipesService.updateRecipe(id,ingredient);
    }

    @DeleteMapping("/{id}")
    public  Recipes deleteIngredient(@PathVariable long id) {
        return recipesService.deleteIngredient(id);
    }
}
