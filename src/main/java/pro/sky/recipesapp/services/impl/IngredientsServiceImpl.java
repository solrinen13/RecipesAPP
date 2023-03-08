package pro.sky.recipesapp.services.impl;

import org.springframework.stereotype.Service;
import pro.sky.recipesapp.model.Ingredients;
import pro.sky.recipesapp.model.Recipes;
import pro.sky.recipesapp.services.IngredientsService;

@Service
public class IngredientsServiceImpl implements IngredientsService {

    @Override
    public void addIngredient(Ingredients ingredient) {

    }

    @Override
    public Recipes getIngredient(long ingredientNumber) {
        return null;
    }
}
