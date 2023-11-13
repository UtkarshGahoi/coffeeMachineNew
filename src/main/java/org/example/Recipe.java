package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Recipe {
    private List<String> instructionList;
     Map<Ingredient, Integer> ingredientMap = new HashMap<>();

    public Map<Ingredient, Integer> getIngredientMap() {
        return this.ingredientMap;
    }

    public List<String> getInstructionList() {
        return instructionList;
    }

    public void setInstructionList(List<String> instructionList) {
        this.instructionList = instructionList;
    }

    public void addIngredient(Ingredient ingredient, int ingredientAmount) {
        this.ingredientMap.put(ingredient, ingredientAmount);
    }
}
