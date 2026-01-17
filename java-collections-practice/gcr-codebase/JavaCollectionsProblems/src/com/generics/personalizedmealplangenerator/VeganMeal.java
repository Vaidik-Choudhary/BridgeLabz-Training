package com.generics.personalizedmealplangenerator;

public class VeganMeal implements MealPlan {

    @Override
    public String getCategory() {
        return "Vegan";
    }

    @Override
    public void displayMeal() {
        System.out.println("Meal: Salad, Lentils, Quinoa");
    }
}

