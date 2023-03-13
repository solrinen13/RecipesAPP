package pro.sky.recipesapp.services;

import pro.sky.recipesapp.model.Ingredients;

import java.util.Collection;
import java.util.List;

public interface IngredientsService {
    void addIngredient(Ingredients ingredient);

    Ingredients getIngredient(long ingredientNumber);

    Collection<Ingredients> getIngredients();


    Ingredients updateIngredient(long id, Ingredients ingredient);

    Ingredients deleteIngredient(long id);
}
