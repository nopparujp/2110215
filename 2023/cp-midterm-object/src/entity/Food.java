package entity;

import java.util.Objects;

public class Food {
    private String name;
    private int price;
    private int tasteScore;

    public Food(String name, int price, int tasteScore) {
        setName(name);
        setPrice(price);
        setTasteScore(tasteScore);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTasteScore() {
        return tasteScore;
    }

    public void setTasteScore(int tasteScore) {
        if (tasteScore < 1) {
            this.tasteScore = 1;
        } else this.tasteScore = Math.min(tasteScore, 5);
    }

    public boolean equals(Food food) {
        return Objects.equals(name, food.getName()) && Objects.equals(price, food.getPrice()) && Objects.equals(tasteScore, food.getTasteScore());
    }
}