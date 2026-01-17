package com.generics.personalizedmealplangenerator;

public class VegetarianMeal implements MealPlan {

    @Override
    public String getCategory() {
        return "Vegetarian";
    }

    @Override
    public void displayMeal() {
        System.out.println("Meal: Paneer, Vegetables, Rice");
    }
}
