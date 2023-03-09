package pro.sky.recipesapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Ingredients {

    private String ingredientName;
    private int quantityIngredients;
    private String typeUnitIngredients;
}
