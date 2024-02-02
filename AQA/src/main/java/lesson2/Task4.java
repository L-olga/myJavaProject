package lesson2;
// 4. Метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз
public class Task4 {
    public static void main(String[] args) {

        String text = "Hello";
        int count = 5;
        printStringMultipleTimes(text, count);
    }

    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }
}


