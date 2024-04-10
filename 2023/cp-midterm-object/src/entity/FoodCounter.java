package entity;

public class FoodCounter {
    private Food food;
    private int amount;

    public FoodCounter(Food food) {
        setFood(food);
        setAmount(1);
    }

    public FoodCounter(Food food, int amount) {
        setFood(food);
        setAmount(amount);
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = Math.max(amount, 1);
    }
}
