package pro.sky.recipesapp.services;

import pro.sky.recipesapp.model.Ingredients;
import pro.sky.recipesapp.model.Recipes;

public interface IngredientsService {
    void addIngredient(Ingredients ingredient);

    Recipes getIngredient(long ingredientNumber);
}
