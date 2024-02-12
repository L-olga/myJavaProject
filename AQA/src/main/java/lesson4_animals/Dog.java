package lesson4_animals;

// Dog.java
// Класс Собака, который наследуется от класса Animal и реализует его абстрактные методы.
public class Dog extends Animal {
    private static int dogCount = 0;
    private final int maxRunDistance = 500;
    private final int maxSwimDistance = 10;


    // Реализация метода для бега.
    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Собака пробежала " + distance + " метров.");
        } else {
            System.out.println("Такая дистанция непосильна для собаки");
        }
    }

    // Реализация метода для плавания.
    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println("Собака проплыла " + distance + " метров.");
        } else {
            System.out.println("Такая дистанция непосильна для собаки");
        }
    }
}

