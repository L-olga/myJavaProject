package lesson2;

// 1. Метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
public class Task1 {

    public static void main(String[] args) {
        // Пример использования метода
        int number1 = 8;
        int number2 = 10;

        boolean result = isSumInRange(number1, number2);

        System.out.println(result);
    }

    // Метод для проверки суммы двух чисел
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;

        // Проверяем, лежит ли сумма в пределах от 10 до 20
        return sum >= 10 && sum <= 20;
    }
}


