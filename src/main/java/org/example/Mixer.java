package org.example;

import java.util.List;
import java.util.Map;

public class Mixer {

    private IngredientInventory ingredientInventory;

    public Mixer(IngredientInventory ingredientInventory) {
        this.ingredientInventory = ingredientInventory;
    }

    public Drink makeDrink(String drinkName, List<String> instructionList, Map<Ingredient, Integer> ingredientMap) {
        for (Ingredient ingredient : ingredientMap.keySet()) {
            if (ingredientInventory.getIngredient(ingredient, ingredientMap.get(ingredient))) {
                continue;
            }
        }
        if (drinkName.equals(Drinks.AMERICANO)) {
            return new Americano(drinkName);
        }
        return null;
    }
}
