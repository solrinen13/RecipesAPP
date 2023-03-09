package pro.sky.recipesapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@Data
public class Recipes {
   private String recipesName;
   private int timeToCook;
   private final List<Ingredients> listIngredients = new ArrayList<>();
   private final List <String> cookSteps = new ArrayList<>();
}
