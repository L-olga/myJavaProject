package lesson4_animals;

// Park.java
// Простой класс для хранения информации о парке аттракционов.
public class Park {
    // Поля для хранения названия аттракциона, его рабочих часов и стоимости.
    private String attractionName;
    private String workingHours;
    private double cost;

    // Конструктор для создания объекта аттракциона.
    public Park(String attractionName, String workingHours, double cost) {
        this.attractionName = attractionName;
        this.workingHours = workingHours;
        this.cost = cost;
    }

    // Метод для получения названия аттракциона.
    public String getAttractionName() {
        return attractionName;
    }

    // Метод для получения рабочих часов аттракциона.
    public String getWorkingHours() {
        return workingHours;
    }

    // Метод для получения стоимости аттракциона.
    public double getCost() {
        return cost;
    }
}

