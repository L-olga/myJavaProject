package lesson4_animals;


// Абстрактный Класс Животное. Все животные могут бежать и плыть.
public abstract class Animal {
    // Абстрактные методы для бега и плавания.
    public abstract void run(int distance);
    public abstract void swim(int distance);
}
