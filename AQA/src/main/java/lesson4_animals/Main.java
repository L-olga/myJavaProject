package lesson4_animals;

// Main.java
// Основной класс, содержащий метод main для проверок.
public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat(), new Cat(), new Cat()}; // Создаем массив котов.
        Bowl bowl = new Bowl(20); // Создаем тарелку с едой.

        for (Cat cat : cats) {
            bowl.eat(cat, 21); // Каждый кот кушает из тарелки.
        }

        for (Cat cat : cats) {
            System.out.println("Кот голоден: " + cat.isHungry()); // Проверяем голод котов.
        }
    }
}
