package com.generics.personalizedmealplangenerator;

public class MealPlannerMain {

    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal =
                new Meal<>(new VegetarianMeal());

        Meal<VeganMeal> veganMeal =
                new Meal<>(new VeganMeal());

        Meal<KetoMeal> ketoMeal =
                new Meal<>(new KetoMeal());

        generateMealPlan(vegMeal);
        generateMealPlan(veganMeal);
        generateMealPlan(ketoMeal);
    }

    public static <T extends MealPlan>
    void generateMealPlan(Meal<T> meal) {

        System.out.println("Generating meal plan...");
        meal.display();
    }
}

