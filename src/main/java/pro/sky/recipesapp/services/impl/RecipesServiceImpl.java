package pro.sky.recipesapp.services.impl;

import lombok.Data;
import org.springframework.stereotype.Service;
import pro.sky.recipesapp.model.Recipes;
import pro.sky.recipesapp.services.RecipesService;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
@Data
public class RecipesServiceImpl implements RecipesService {
    private static long lastId = 0;

    public static long getLastId() {
        return lastId;
    }

    Map<Long, Recipes> recipesMap = new HashMap<>();
    @Override
    public Recipes addRecipes(Recipes recipe) {

       return recipesMap.put(++lastId,recipe);
    }
    @Override
    public Recipes getRecipe(long id) {
        Recipes recipe = recipesMap.get(id);
        if(recipe != null){
            return recipesMap.get(id);
        }
        return null;
    }

    @Override
    public Collection<Recipes> getRecipes() {
        return recipesMap.values();
    }

    @Override
    public Recipes updateRecipe(long id, Recipes ingredient) {
        recipesMap.replace(id,ingredient);
        return recipesMap.get(id);
    }

    @Override
    public Recipes deleteIngredient(long id) {
        return recipesMap.remove(id);
    }

    @Override
    public Collection<Recipes> getRecipesId(long id) {
        return recipesMap.values();
    }
}
