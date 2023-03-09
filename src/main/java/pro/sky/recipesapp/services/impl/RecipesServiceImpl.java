package pro.sky.recipesapp.services.impl;

import lombok.Data;
import org.springframework.stereotype.Service;
import pro.sky.recipesapp.model.Recipes;
import pro.sky.recipesapp.services.RecipesService;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
@Service
@Data
public class RecipesServiceImpl implements RecipesService {
    private static long lastId = 0;
    Map<Long, Recipes> recipesMap = new HashMap<>();
    @Override
    public void addRecipes(Recipes recipe) {
        recipesMap.put(++lastId,recipe);
        System.out.println("Рецепт добавлен и его ID = " + lastId);
    }
    @Override
    public Recipes getRecipe(long recipeNumber) {
        return recipesMap.get(recipeNumber);
    }


}
