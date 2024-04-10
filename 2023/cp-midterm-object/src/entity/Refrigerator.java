package entity;

import java.util.ArrayList;

public class Refrigerator {
    private final ArrayList<FoodCounter> foods;

    public Refrigerator() {
        foods = new ArrayList<>();
    }

    public boolean isNewFood(Food food) {
        for (FoodCounter foodCounter : foods) {
            if (foodCounter.getFood().equals(food)) {
                return false;
            }
        }
        return true;
    }

    public void addFood(Food food, int amount) {
        if (isNewFood(food)) {
            foods.add(new FoodCounter(food, amount));
        } else {
            for (FoodCounter foodCounter : foods) {
                if (foodCounter.getFood().equals(food)) {
                    foodCounter.setAmount(foodCounter.getAmount() + amount);
                    return;
                }
            }
        }
    }

    public boolean deleteFood(Food food) {
        if (isNewFood(food)) {
            System.out.println("No food in refrigerator");
            return false;
        } else {
            for (FoodCounter foodCounter : foods) {
                if (foodCounter.getFood().equals(food)) {
                    if (foodCounter.getAmount() == 1) {
                        foods.remove(foodCounter);
                        return true;
                    } else {
                        foodCounter.setAmount(foodCounter.getAmount() - 1);
                    }
                }
            }
            return true;
        }
    }

    public ArrayList<FoodCounter> getFoods() {
        return foods;
    }
}
