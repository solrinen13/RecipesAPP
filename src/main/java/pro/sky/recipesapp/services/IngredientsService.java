package pro.sky.recipesapp.services;

import pro.sky.recipesapp.model.Ingredients;

public interface IngredientsService {
    void addIngredient(Ingredients ingredient);

    Ingredients getIngredient(long ingredientNumber);
}
