package pro.sky.recipesapp.services;


import pro.sky.recipesapp.model.Recipes;

import java.util.Collection;
import java.util.Map;

public interface RecipesService {
    void addRecipes(Recipes recipes);

    Recipes getRecipe(long recipeNumber);
}
