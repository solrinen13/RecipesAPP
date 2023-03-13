package pro.sky.recipesapp.services.impl;

import lombok.Data;
import org.springframework.stereotype.Service;
import pro.sky.recipesapp.model.Ingredients;
import pro.sky.recipesapp.services.IngredientsService;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
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
    public Ingredients getIngredient(long id) {
        return ingredientsMap.get(id);
    }

    @Override
    public Collection<Ingredients> getIngredients() {
        return ingredientsMap.values();
    }

    @Override
    public Ingredients updateIngredient(long id, Ingredients ingredient) {
        ingredientsMap.replace(id,ingredient);
        return getIngredient(id);
    }

    @Override
    public Ingredients deleteIngredient(long id) {
        return ingredientsMap.remove(id);
    }
}
