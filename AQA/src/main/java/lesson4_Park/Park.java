package lesson4_Park;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private List<Attraction> attractions;

    public Park() {
        attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String workingHours, double cost) {
        Attraction attraction = new Attraction(name, workingHours, cost);
        attractions.add(attraction);
    }

    public void showAttractions() {
        for (Attraction attraction : attractions) {
            System.out.println(attraction.getName() + " - " + attraction.getWorkingHours() + " - $" + attraction.getCost());
        }
    }
}
