package entity;

public class Person {
    private String name;
    private int totalMoney;
    private int happinessLevel;
    private int dailyIncome;

    public Person() {
        setDailyIncome(300);
        setHappinessLevel(-2);
        setTotalMoney(20);
        setName("John Doe");
    }

    public void eat(Food food) {
        setHappinessLevel(getHappinessLevel() + food.getTasteScore());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = Math.max(totalMoney, 0);
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public int getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(int dailyIncome) {
        this.dailyIncome = Math.max(dailyIncome, 0);
    }
}
