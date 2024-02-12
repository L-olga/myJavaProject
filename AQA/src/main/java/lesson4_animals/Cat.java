package lesson4_animals;

// Cat.java
// Класс Кот, который наследуется от класса Animal и реализует его абстрактные методы.
public class Cat extends Animal {
    private static int catCount = 0;
    private final int maxRunDistance = 200;
    private final int maxSwimDistance = 0;
    private boolean hungry = true;


    // Реализация метода для бега.
    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Кот пробежал " + distance + " метров.");
        } else {
            System.out.println("Кот не может пробежать такую дистанцию.");
        }
    }

    // Реализация метода для плавания.
    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }

    // Метод для кормления кота.
    public boolean eat(int foodAmount) {
        if (foodAmount <= 0) {
            return false;
        }
        hungry = false; // Если кот покушал, он больше не голоден.
        System.out.println("Кот поел и больше не голоден.");
        return true;
    }

    // Метод для проверки голода кота.
    public boolean isHungry() {
        return hungry;
    }
}
