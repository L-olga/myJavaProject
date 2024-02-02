package lesson2;
// 7. Массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
public class Task7 {

    public static void main(String[] args) {
        // Размер массива
        int size = 6;

        // Создание массива
        int[][] array = new int[size][size];

        // Заполняем диагональю
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }
        }

        // Вывод массива
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}