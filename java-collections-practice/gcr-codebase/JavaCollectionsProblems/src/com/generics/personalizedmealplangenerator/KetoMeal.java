package com.generics.personalizedmealplangenerator;

public class KetoMeal implements MealPlan {

    @Override
    public String getCategory() {
        return "Keto";
    }

    @Override
    public void displayMeal() {
        System.out.println("Meal: Eggs, Cheese, Avocado");
    }
}
