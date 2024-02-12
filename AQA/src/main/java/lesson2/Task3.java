package lesson2;
// 3. Метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
public class Task3 {

    public static void main(String[] args) {
        int number = -7;
        boolean result = isNegative(number);
        System.out.println(result);
    }
    public static boolean isNegative(int number) {
        return number < 0;
    }
}
