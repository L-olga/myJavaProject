package lesson4_Park;

public class Main {
    public static void main(String[] args) {
        Park park = new Park();

        park.addAttraction("Колесо обозрения", "10:00 - 23:00", 50.0);
        park.addAttraction("Американские горки", "11:00 - 21:00", 15.0);
        park.addAttraction("Лабиринт", "12:00 - 22:00", 20.0);

        park.showAttractions();
    }
}
