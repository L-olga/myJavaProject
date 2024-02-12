package lesson4_Payment;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.addItem("Товар 1", 10.0);
        payment.addItem("Товар 2", 20.0);
        payment.addItem("Товар 3", 30.0);

        payment.showItems();
    }
}
