package lesson2;
// 2. Метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное.
public class Task2 {

    public static void main(String[] args) {
        int number = 9;
        printPositiveOrNegative(number);
    }
    public static void printPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}

