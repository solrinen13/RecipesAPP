package pro.sky.recipesapp.services.impl;

import lombok.Data;
import org.springframework.stereotype.Service;
import pro.sky.recipesapp.model.Ingredients;
import pro.sky.recipesapp.services.IngredientsService;

import java.util.HashMap;
import java.util.Map;

@Service
@Data
public class IngredientsServiceImpl implements IngredientsService {

    private static long lastId = 0;
    Map<Long, Ingredients> ingredientsMap = new HashMap<>();

    @Override
    public void addIngredient(Ingredients ingredient) {
        ingredientsMap.put(++lastId, ingredient);
        System.out.println("Рецепт добавлен и его ID = " + lastId);
    }

    @Override
    public Ingredients getIngredient(long ingredientNumber) {
        return ingredientsMap.get(ingredientNumber);
    }
}
