package com.generics.personalizedmealplangenerator;

public class HighProteinMeal implements MealPlan {

    @Override
    public String getCategory() {
        return "High Protein";
    }

    @Override
    public void displayMeal() {
        System.out.println("Meal: Chicken, Beans, Nuts");
    }
}

