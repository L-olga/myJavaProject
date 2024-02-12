package lesson2;
// 6.  Пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
public class Task6 {

    public static void main(String[] args) {
        // Создаем пустой целочисленный массив длиной 100
        int[] array = new int[100];

        // Заполняем массив от 1 до 100
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }

        // Вывод в консоль
        for (int i = 0; i < 100; i++) {
            System.out.print(array[i] + " ");
        }
    }
}