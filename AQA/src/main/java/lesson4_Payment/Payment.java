package lesson4_Payment;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    List<Item> itemList = new ArrayList<>();

    public Payment() {}

    public void showItems() {
        itemList.forEach(System.out::println);
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void addItem(String name, double price) {
        itemList.add(new Item(name, price));
    }

    // Внутренний класс для представления товара.
    private class Item {
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}

