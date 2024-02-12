package lesson4_animals;

// Bowl.java
// Класс Тарелка для еды, в которой хранится количество еды.
public class Bowl {
    private int foodAmount; // Количество еды в тарелке.

    // Конструктор, инициализирующий количество еды в тарелке.
    public Bowl(int initialFoodAmount) {
        this.foodAmount = Math.max(initialFoodAmount, 0); // Не допускаем отрицательное количество еды.
    }

    // Метод для добавления еды в тарелку.
    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("Добавлено " + amount + " единиц еды в тарелку.");
        }
    }

    // Метод для кормления кота из тарелки.
    public boolean eat(Cat cat, int amount) {
        if (amount <= 0 || amount > foodAmount) {
            return false;
        }
        cat.eat(amount); // Кормим кота.
        foodAmount -= amount; // Уменьшаем количество еды в тарелке.
        return true;
    }
}


