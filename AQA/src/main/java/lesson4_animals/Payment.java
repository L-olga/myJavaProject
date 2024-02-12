package lesson4_animals;

// Payment.java
// Класс для создания покупок с внутренним классом Item.
import java.util.ArrayList;
import java.util.List;

public class Payment {
    // Внутренний класс для представления товара.
    public static class Item {
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        // Метод для получения названия товара.
        public String getName() {
            return name;
        }

        // Метод для получения цены товара.
        public double getPrice() {
            return price;
        }
    }

    private List<Item> items; // Список товаров в покупке.

    public Payment() {
        items = new ArrayList<>();
    }

    // Метод для добавления товара в покупку.
    public void addItem(String name, double price) {
        Item item = new Item(name, price);
        items.add(item);
    }

    // Метод для расчета общей суммы покупки.
    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
