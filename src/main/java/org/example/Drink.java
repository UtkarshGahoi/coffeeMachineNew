package org.example;

import java.util.HashMap;
import java.util.Map;

public abstract class Drink {
    String drinkName;
    Recipe recipe;
    Double price;
    Mixer mixer;
    Map<Ingredient, Integer> commonIngredient;

    public Drink(String drinkName) {
        this.drinkName = drinkName;
    }

    public Drink(String drinkName, Recipe recipe, Double price, Mixer mixer) {
        this.drinkName = drinkName;
        this.recipe = recipe;
        this.price = price;
        this.mixer = mixer;
    }

    public abstract Drink process();

    public abstract void addCommonIngredient(Ingredient ingredient, int volume);

    public Map<Ingredient, Integer> getWholeIngredient(Map<Ingredient, Integer> drinkSpecificIngredientMap) {
        Map<Ingredient, Integer> map = new HashMap<>();
        map.putAll(commonIngredient);
        return map;
    }
}
