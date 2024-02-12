package lesson4_Park;

public class Attraction {
    private String name;
    private String workingHours;
    private double cost;

    public Attraction(String name, String workingHours, double cost) {
        this.name = name;
        this.workingHours = workingHours;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public double getCost() {
        return cost;
    }
}

