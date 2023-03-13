package pro.sky.recipesapp.services;


import pro.sky.recipesapp.model.Recipes;

import java.util.Collection;
import java.util.Map;

public interface RecipesService {
    Recipes addRecipes(Recipes recipes);

    Recipes getRecipe(long id);

    Collection<Recipes> getRecipes();

    Recipes updateRecipe(long id, Recipes ingredient);

    Recipes deleteIngredient(long id);

    Collection<Recipes> getRecipesId(long id);
}
